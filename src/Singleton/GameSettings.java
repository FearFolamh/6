package Singleton;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GameSettings {
    private static GameSettings instance;
    private int volume;
    private String resolution;
    private static final String settingFile = "setting.txt";

    private GameSettings(){
        loadSettings();
    }

    public static synchronized GameSettings getInstance()
    {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public void setVolume(int volume){
        if (volume < 0 || volume > 100){
            throw new IllegalArgumentException("Volume must be between 0 and 100");
        }
        this.volume = volume;
        saveSettings();
    }

    public int getVolume(){
        return volume;
    }

    public void setResolution(String resolution){
        if(resolution == null){
            throw new IllegalArgumentException("Resolution cannot be null");
        }
        this.resolution = resolution;
        saveSettings();
    }

    public String getResolution(){
        return resolution;
    }

    private void saveSettings(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(settingFile,false))){
            writer.write("Volume: " + volume + "\n");
            writer.write("Resolution: " + resolution + "\n");
            writer.write("Time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")) + "\n");

        } catch (IOException e) {
            System.err.println("Error saving settings: " + e.getMessage());
        }
    }

    private void loadSettings(){
        File file = new File(settingFile);
        if(!file.exists()){
            this.volume = 50;
            this.resolution = "1920x1080";
            saveSettings();
            return;
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Volume: ")) {
                    this.volume = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("Resolution: ")) {
                    this.resolution = line.substring(12);
                }
            }
        }
             catch(IOException | NumberFormatException e)
             {
                 System.err.println("Error load settings , using default: " + e.getMessage());
                 this.volume = 50;
                 this.resolution = "1920x1080";
            }
        }
        @Override
        public String toString() {
        return  "Volume: " + volume + "\n" +
                "Resolution: " + resolution;
        }

    }



