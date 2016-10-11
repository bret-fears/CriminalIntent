package com.bignerdranch.android.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by bretfears on 10/11/16.
 */

public class ZoomedPhotoFragment extends DialogFragment {

    private static Bitmap mBitmap;

    public static ZoomedPhotoFragment newInstance(Bitmap file) {
        Bundle args = new Bundle();
        mBitmap = file;

        ZoomedPhotoFragment fragment = new ZoomedPhotoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_zoomed_photo, null);

        ImageView image = (ImageView) view.findViewById(R.id.image_area);
        image.setImageBitmap(mBitmap);

        return new AlertDialog.Builder(getActivity())
                .setView(view)
                .create();
    }
}
