package com.yunusseker.roomexample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by yunusseker
 * younuseker@gmail.com
 * https://github.com/yunuseker
 */

@Entity(tableName = "data")
public class DataEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "data")
    private String name;

    public DataEntity() {
    }

    public DataEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DataEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
