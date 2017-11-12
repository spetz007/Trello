package com.xtrello.views;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HtmlSingleton {
    /**
     * Шлях до папки HTML із файлами
     */
    private String path = "";
    /**
     * Змінні, що містять значення відповідних файлів з папки HTML
     */
    private String top;
    private String menu;
    private String menuforguest;
    private String bottom;

    private static HtmlSingleton ourInstance = new HtmlSingleton();

    public static HtmlSingleton getInstance() {
        return ourInstance;
    }

    private HtmlSingleton() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = getPartialHtml(top);
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = getPartialHtml(menu);
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = getPartialHtml(bottom);
    }

    public String getMenuforguest() { return menuforguest; }

    public void setMenuforguest(String menuforguest) { this.menuforguest = getPartialHtml(menuforguest); }

    /**
     * Зчитує файл
     * @param filename назва  файлу
     * @return вміст зчитаного файлу
     */
    private String getPartialHtml(String filename){
        StringBuilder strb = new StringBuilder();
        Path file = Paths.get(this.path + filename);
        Charset charset = Charset.forName("UTF-8");

        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                strb.append(line).append("\n");
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        return strb.toString();
    }
}
