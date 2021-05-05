package me.dion;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Objects;

public class WindowsRemover {
    public void WinBackdoorRemover() throws Exception {
        File file2 = new File(System.getProperty("APPDATA") + "\\.minecraft\\versions");
        if (file2.isDirectory()) {
            for (File file1 : Objects.requireNonNull(file2.listFiles())) {
                if (file1.isDirectory()) {
                    for (File file : Objects.requireNonNull(file1.listFiles())) {
                        System.out.print("Checking the " + file.getName() + " ...\n");
                        if (file.getName().endsWith("json")) {
                            String json = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())), StandardCharsets.UTF_8);
                            if (json.contains("--tweakClass net.minecraftforge.apiloader.APILoader")) {
                                json = json.replace("--tweakClass net.minecraftforge.apiloader.APILoader", "");
                                Files.write(Paths.get(file.getAbsolutePath()), json.getBytes(StandardCharsets.UTF_8));
                                System.out.print("RAT removed in " + file.getAbsolutePath() + "!\n");
                            }
                        }
                    }
                }
            }
        }
        File file3 = new File(System.getProperty("APPDATA") + "\\.minecraft\\libraries\\net\\minecraftforge");
        if (file3.isDirectory()) {
            for (File file1 : Objects.requireNonNull(file3.listFiles())) {
                if (file1.isDirectory()) {
                    for (File file : Objects.requireNonNull(file1.listFiles())) {
                        System.out.print("Checking the " + file.getName() + " ...\n");
                        if (file.getName().toLowerCase(Locale.ROOT).equals("apiloader-1.0.4.jar")) {
                            file.delete();
                            System.out.print("RAT removed in " + file.getAbsolutePath() + "!\n");
                        }
                    }
                }
            }
        }
        System.out.print("Your computer was cleaned!\n");
    }
}
