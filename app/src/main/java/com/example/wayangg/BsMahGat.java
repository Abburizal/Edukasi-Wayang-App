package com.example.wayangg;

import android.app.Dialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class BsMahGat extends BottomSheetDialogFragment {

    public BsMahGat() {
        // Required empty public constructor
    }
    private AppBarLayout appBarLayout;
    private LinearLayout linearLayout;


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        final View view = View.inflate(getContext(),R.layout.fragment_bs_mah_gat, null);
        dialog.setContentView(view);


        final BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View)view.getParent());
        bottomSheetBehavior.setPeekHeight(BottomSheetBehavior.PEEK_HEIGHT_AUTO);

        appBarLayout = view.findViewById(R.id.appBarwg3);
        linearLayout = view.findViewById(R.id.wg3_linear);
        hideView(linearLayout);

        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View view, int i) {
                if(BottomSheetBehavior.STATE_EXPANDED == i){
                    showView(appBarLayout, getActionBarSize());
                    hideView(linearLayout);
                }

                if(BottomSheetBehavior.STATE_COLLAPSED == i){
                    hideView(appBarLayout);
                    showView(linearLayout, getActionBarSize());
                }
                if(BottomSheetBehavior.STATE_HIDDEN == i){
                    dismiss();
                }
            }

            @Override
            public void onSlide(@NonNull View view, float v) {

            }
        });

        view.findViewById(R.id.closeSheetwg3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return dialog;
    }

    private void hideView(View view) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = 0;
        view.setLayoutParams(params);
    }

    private void showView(View view, int size) {
        ViewGroup.LayoutParams params =view.getLayoutParams();
        params.height = size;
        view.setLayoutParams(params);
    }

    private int getActionBarSize(){
        final TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(new int[]{
                android.R.attr.actionBarSize
        });
        return (int) typedArray.getDimension(0,0);
    }
}
