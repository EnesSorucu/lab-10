package msku.ceng.madlab.week9;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {

    private String header;
    private Date date;
    public String filePath;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFilepath() {
        return filePath;
    }

    public void setFilepath(String filepath) {
        this.filePath = filepath;
    }
}
