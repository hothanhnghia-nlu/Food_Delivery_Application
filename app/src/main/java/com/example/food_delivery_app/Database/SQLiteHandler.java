package com.example.food_delivery_app.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.food_delivery_app.order_completed.model.Rate;

public class SQLiteHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Food";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "rating";

    private static final String KEY_ID_RATING = "id_rating";
    private static final String KEY_ID_ORDER = "id_order";
    private static final String RATING = "rating";
    private static final String CONTENT = "content";

    public SQLiteHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_students_table = String.format("CREATE TABLE %s(%s INTEGER PRIMARY KEY, %s TEXT, %s TEXT, %s TEXT)", TABLE_NAME, KEY_ID_RATING, KEY_ID_ORDER, RATING, CONTENT);
        db.execSQL(create_students_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String drop_students_table = String.format("DROP TABLE IF EXISTS %s", TABLE_NAME);
        db.execSQL(drop_students_table);

        onCreate(db);
    }

    public void addRating(Rate rate) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ID_ORDER, rate.getOrderId());
        values.put(RATING, rate.getRateNum());
        values.put(CONTENT, rate.getContent());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public Rate getRatingWhereId(int studentId) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, null, KEY_ID_ORDER + " = ?", new String[] { String.valueOf(studentId) },null, null, null);
        if(cursor != null)
            cursor.moveToFirst();
        Rate rate = new Rate(cursor.getInt(0), cursor.getInt(1), cursor.getFloat(2), cursor.getString(3));
        return rate;
    }
}