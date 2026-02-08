package com.secureguard.mdm.appblocker

import android.graphics.drawable.Drawable

/**
 * Data class לייצוג מידע על אפליקציה בודדת.
 * @param appName שם האפליקציה כפי שהוא מוצג למשתמש.
 * @param packageName שם החבילה הייחודי של האפליקציה.
 * @param icon האייקון של האפליקציה.
 * @param isBlocked מציין אם האפליקציה מסומנת לחסימה.
 * @param isSystemApp מציין אם זוהי אפליקציית מערכת.
 * @param isLauncherApp מציין אם זוהי אפליקציה שמופיעה ב-Launcher (מסך הבית).
 * @param isSuspended מציין אם האפליקציה מושעית (Suspended) במקום חסומה.
 * @param isInstalled מציין אם האפליקציה מותקנת כרגע במכשיר.
 */
data class AppInfo(
    val appName: String,
    val packageName: String,
    // --- התיקון כאן: הוספת @Transient כדי למנוע מ-Gson לנסות לסרוק את האובייקט המורכב הזה ---
    @Transient val icon: Drawable,
    val isBlocked: Boolean,
    val isSystemApp: Boolean,
    val isLauncherApp: Boolean,
    val isSuspended: Boolean = false,
    val isInstalled: Boolean = true
)
