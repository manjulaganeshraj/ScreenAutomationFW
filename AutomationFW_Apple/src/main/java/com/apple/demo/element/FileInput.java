package com.apple.demo.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import static com.apple.demo.utils.HtmlElementUtils.*;

import java.io.File;

public class FileInput extends TypifiedElement {
   
    public FileInput(WebElement wrappedElement) {
        super(wrappedElement);
    }

   
    public void setFileToUpload(final String fileName) {
        // Proxy can't be used to check the element class, so find real WebElement
        WebElement fileInputElement = getNotProxiedInputElement();
        // Set local file detector in case of remote driver usage
        if (isOnRemoteWebDriver(fileInputElement)) {
            setLocalFileDetector((RemoteWebElement) fileInputElement);
        }

        String filePath = getFilePath(fileName);
        fileInputElement.sendKeys(filePath);
    }

    public void submit() {
        getWrappedElement().submit();
    }

    private WebElement getNotProxiedInputElement() {
        return getWrappedElement().findElement(By.xpath("."));
    }

    private void setLocalFileDetector(RemoteWebElement element) {
        element.setFileDetector(new LocalFileDetector());
    }

    private String getFilePath(final String fileName) {
        if (existsInClasspath(fileName)) {
            return getPathForResource(fileName);
        }
        return getPathForSystemFile(fileName);
    }

    private String getPathForResource(final String fileName) {
    	
        return getResourceFromClasspath(fileName).getPath();
    }

    private String getPathForSystemFile(final String fileName) {
        File file = new File(fileName);
        return file.getPath();
    }
}
