package com.secureguard.mdm.settingsfeatures.api

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.secureguard.mdm.R

/**
 * קטגוריות להצגת הפריטים באופן מסודר במסך ההגדרות.
 * @param titleRes מזהה המשאב (string) עבור שם הקטגוריה.
 */
enum class SettingCategory(@StringRes val titleRes: Int) {
    APP_MANAGEMENT(R.string.category_app_management),
    UI_AND_BEHAVIOR(R.string.category_ui_and_behavior),
    ADVANCED_ACTIONS(R.string.category_advanced_actions)
}

/**
 * הממשק הראשי שכל פריט הגדרה חייב לממש.
 */
sealed interface SettingsFeature {
    val id: String
    @get:StringRes val titleRes: Int
    @get:DrawableRes val iconRes: Int
    val category: SettingCategory
    val requiredSdkVersion: Int get() = 0
}

/**
 * מייצג פריט הגדרה שלחיצה עליו מנווטת למסך אחר.
 */
interface NavigationalSetting : SettingsFeature {
    val route: String // הנתיב לניווט, מתוך Routes.kt
}

/**
 * מייצג פריט הגדרה שהוא מתג (Toggle/Switch/Checkbox).
 */
interface ToggleSetting : SettingsFeature

/**
 * מייצג פריט הגדרה שלחיצה עליו מבצעת פעולה כללית.
 */
interface ActionSetting : SettingsFeature

/**
 * מייצג פריט הגדרה שלחיצה עליו מבצעת פעולה מסוכנת או בלתי הפיכה (יוצג באדום).
 */
interface DestructiveActionSetting : ActionSetting