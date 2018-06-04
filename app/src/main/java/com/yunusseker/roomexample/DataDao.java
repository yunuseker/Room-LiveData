package com.yunusseker.roomexample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by yunusseker
 * younuseker@gmail.com
 * https://github.com/yunuseker
 */
@Dao
public interface DataDao {

    @Insert
    void addData(DataEntity dataEntity);

    @Query("SELECT * FROM data")
    LiveData<List<DataEntity>> getEvents();

}
