package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FileU {

    String filepath;
    String filename;

    public FileU(String name, String path) {
        this.filename = name;
        this.filepath = path;
    }

    public void up() {
        try {
            Connection con = ConnectionProvider.conn();

            String sql = "INSERT INTO file(file_name,file_content) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            File f = new File(filepath);
            FileInputStream input = new FileInputStream(f);

            st.setString(1, f.getName());
            st.setBinaryStream(2, input, (int) f.length());

            st.executeUpdate();

            input.close();
            st.close();
            con.close();
            System.out.println("Upload Successfull");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void down() {

        try {
            // Establish a database connection
            Connection con = ConnectionProvider.conn();
            // Prepare SQL statement to retrieve file data
            String sql = "SELECT file_content FROM file WHERE file_name = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, fileId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                // Retrieve file data from the database
                String fileName = resultSet.getString("file_name");
                InputStream fileContent = resultSet.getBinaryStream("file_content");
                // Define the local directory path to save the downloaded file
                String localDirectory = "your_local_directory_path/";
                String localFilePath = localDirectory + fileName;
                // Write the file content to a local file
                FileOutputStream outputStream = new FileOutputStream(localFilePath);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fileContent.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                // Close resources
                outputStream.close();
                fileContent.close();
                statement.close();
                con.close();
                System.out.println("File downloaded successfully to: " + localFilePath);
            } else {
                System.out.println("File not found in the database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
