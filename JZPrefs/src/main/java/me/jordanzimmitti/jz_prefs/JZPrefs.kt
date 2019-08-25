package me.jordanzimmitti.jz_prefs

import android.content.Context
import androidx.core.content.edit

/** Kotlin Class JZPrefs
 *
 * Object That Handles The Saving And Getting Of Shared Preferences
 *
 * @author Jordan Zimmitti
 *
 * @version 1.0.0
 */
object JZPrefs {

    /**.
     * Function That Saves A Preference Of Type Boolean
     *
     * @param [context] The instance from the caller class
     * @param [prefId]  The unique id for the preference
     * @param [pref]    The preference of type boolean
     */
    fun savePref(context: Context, prefId: String, pref: Boolean) {

        // Saves The Boolean Preference//
        context.getSharedPreferences(prefId, 0).edit {

            // Clears The Previous Preference//
            clear()

            // Puts The Preference In The Editor To Be Saved//
            putBoolean(prefId, pref)

            // Saves The Preference//
            apply()
        }
    }

    /**.
     * Function That Saves A Preference Of Type Float
     *
     * @param [context] The instance from the caller class
     * @param [prefId]  The unique id for the preference
     * @param [pref]    The preference of type float
     */
    fun savePref(context: Context, prefId: String, pref: Float) {

        // Saves The Float Preference//
        context.getSharedPreferences(prefId, 0).edit {

            // Clears The Previous Preference//
            clear()

            // Puts The Preference In The Editor To Be Saved//
            putFloat(prefId, pref)

            // Saves The Preference//
            apply()
        }
    }

    /**.
     * Function That Saves A Preference Of Type Int
     *
     * @param [context] The instance from the caller class
     * @param [prefId]  The unique id for the preference
     * @param [pref]    The preference of type int
     */
    fun savePref(context: Context, prefId: String, pref: Int) {

        // Saves The Int Preference//
        context.getSharedPreferences(prefId, 0).edit {

            // Clears The Previous Preference//
            clear()

            // Puts The Preference In The Editor To Be Saved//
            putInt(prefId, pref)

            // Saves The Preference//
            apply()
        }
    }

    /**.
     * Function That Saves A Preference Of Type Long
     *
     * @param [context] The instance from the caller class
     * @param [prefId]  The unique id for the preference
     * @param [pref]    The preference of type long
     */
    fun savePref(context: Context, prefId: String, pref: Long) {

        // Saves The Long Preference//
        context.getSharedPreferences(prefId, 0).edit {

            // Clears The Previous Preference//
            clear()

            // Puts The Preference In The Editor To Be Saved//
            putLong(prefId, pref)

            // Saves The Preference//
            apply()
        }
    }

    /**.
     * Function That Saves A Preference Of Type String Set
     *
     * @param [context] The instance from the caller class
     * @param [prefId]  The unique id for the preference
     * @param [pref]    The preference of type string set
     */
    fun savePref(context: Context, prefId: String, pref: MutableSet<String>) {

        // Saves The String Set Preference//
        context.getSharedPreferences(prefId, 0).edit {

            // Clears The Previous Preference//
            clear()

            // Puts The Preference In The Editor To Be Saved//
            putStringSet(prefId, pref)

            // Saves The Preference//
            apply()
        }
    }

    /**.
     * Function That Saves A Preference Of Type String
     *
     * @param [context] The instance from the caller class
     * @param [prefId]  The unique id for the preference
     * @param [pref]    The preference of type string
     */
    fun savePref(context: Context, prefId: String, pref: String) {

        // Saves The String Preference//
        context.getSharedPreferences(prefId, 0).edit {

            // Clears The Previous Preference//
            clear()

            // Puts The Preference In The Editor To Be Saved//
            putString(prefId, pref)

            // Saves The Preference//
            apply()
        }
    }

    /**.
     * Function That Gets A Saved Preference Of Type Boolean
     *
     * @return The boolean preference
     */
    fun getPref(context: Context, prefId: String, default: Boolean): Boolean {

        // Returns The Boolean Preference//
        return context.getSharedPreferences(prefId, 0).getBoolean(prefId, default)
    }

    /**.
     * Function That Gets A Saved Preference Of Type Float
     *
     * @return The float preference
     */
    fun getPref(context: Context, prefId: String, default: Float): Float {

        // Returns The Float Preference//
        return context.getSharedPreferences(prefId, 0).getFloat(prefId, default)
    }

    /**.
     * Function That Gets A Saved Preference Of Type Int
     *
     * @return The int preference
     */
    fun getPref(context: Context, prefId: String, default: Int): Int {

        // Returns The Int Preference//
        return context.getSharedPreferences(prefId, 0).getInt(prefId, default)
    }

    /**.
     * Function That Gets A Saved Preference Of Type Long
     *
     * @return The long preference
     */
    fun getPref(context: Context, prefId: String, default: Long): Long {

        // Returns The Long Preference//
        return context.getSharedPreferences(prefId, 0).getLong(prefId, default)
    }

    /**.
     * Function That Gets A Saved Preference Of Type String Set
     *
     * @return The string set preference
     */
    fun getPref(context: Context, prefId: String, default: MutableSet<String>): MutableSet<String>? {

        // Returns The String Set Preference//
        return context.getSharedPreferences(prefId, 0).getStringSet(prefId, default)
    }

    /**.
     * Function That Gets A Saved Preference Of Type String
     *
     * @return The string preference
     */
    fun getPref(context: Context, prefId: String, default: String): String? {

        // Returns The String Preference//
        return context.getSharedPreferences(prefId, 0).getString(prefId, default)
    }
}
