package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by berso on 5/28/17.
 */

public final  class PetContract {

    private PetContract(){}

    public static class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "Pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";


        /**
         * Possible values for DOG GENDER.
         */
        public static final int GENDER_UNKNOW = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }


}
