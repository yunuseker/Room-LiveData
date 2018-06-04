package com.yunusseker.roomexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by yunusseker
 * younuseker@gmail.com
 * https://github.com/yunuseker
 */

@Database(entities = {DataEntity.class}, version = 2,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DataDao dataDao();
}
