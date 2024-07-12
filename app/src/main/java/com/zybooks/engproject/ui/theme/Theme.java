package com.zybooks.engproject.ui.theme;

import android.os.Build;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.isSystemInDarkTheme;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.darkColorScheme;
import androidx.compose.material3.dynamicDarkColorScheme;
import androidx.compose.material3.dynamicLightColorScheme;
import androidx.compose.material3.lightColorScheme;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.LocalContext;

public class Theme {

    private static final ColorScheme DarkColorScheme = darkColorScheme(
            Color.Purple80,
            Color.PurpleGrey80,
            Color.Pink80
    );

    private static final ColorScheme LightColorScheme = lightColorScheme(
            Color.Purple40,
            Color.PurpleGrey40,
            Color.Pink40
        /* Other default colors to override
        new Color(0xFFFFFBFE), // background
        new Color(0xFFFFFBFE), // surface
        Color.White, // onPrimary
        Color.White, // onSecondary
        Color.White, // onTertiary
        new Color(0xFF1C1B1F), // onBackground
        new Color(0xFF1C1B1F)  // onSurface
        */
    );

    @Composable
    public static void EngProjectTheme(
            ComponentActivity activity,
            boolean darkTheme,
            boolean dynamicColor,
            @Composable Runnable content
    ) {
        ColorScheme colorScheme;

        if (dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            LocalContext currentContext = LocalContext.current(activity);
            colorScheme = darkTheme ? dynamicDarkColorScheme(currentContext) : dynamicLightColorScheme(currentContext);
        } else {
            colorScheme = darkTheme ? DarkColorScheme : LightColorScheme;
        }

        MaterialTheme.INSTANCE(colorScheme, Typography.INSTANCE, content);
    }
}
