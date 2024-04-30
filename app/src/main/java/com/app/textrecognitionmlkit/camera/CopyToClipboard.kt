package com.app.textrecognitionmlkit.camera

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import com.app.textrecognitionmlkit.R

fun copyToClipboard(text: String, context: Context) {
    val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clipData = ClipData.newPlainText(context.getString(R.string.text), text)
    clipboardManager.setPrimaryClip(clipData)
    Toast.makeText(context, "Text copied to clipboard", Toast.LENGTH_SHORT).show()
}