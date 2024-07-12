package com.zybooks.engproject.ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Sp;

public class Type {

    public static final Typography Typography = new Typography(
            new TextStyle.Builder()
                    .setFontFamily(FontFamily.Default)
                    .setFontWeight(FontWeight.Normal)
                    .setFontSize(16.sp.toPx())
                    .setLineHeight(24.sp.toPx())
                    .setLetterSpacing(0.5.sp.toPx())
                    .build()
        /* Other default text styles to override
        , new TextStyle.Builder()
            .setFontFamily(FontFamily.Default)
            .setFontWeight(FontWeight.Normal)
            .setFontSize(22.sp.toPx())
            .setLineHeight(28.sp.toPx())
            .setLetterSpacing(0.sp.toPx())
            .build()
        , new TextStyle.Builder()
            .setFontFamily(FontFamily.Default)
            .setFontWeight(FontWeight.Medium)
            .setFontSize(11.sp.toPx())
            .setLineHeight(16.sp.toPx())
            .setLetterSpacing(0.5.sp.toPx())
            .build()
        */
    );
}
