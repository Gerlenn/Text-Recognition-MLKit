package com.app.textrecognitionmlkit.main

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.textrecognitionmlkit.R

@Composable
fun PermissionScreen(
    onRequestPermission: () -> Unit,
) {
    PermissionContent(
        onRequestPermission = onRequestPermission,
    )
}

@Composable
fun PermissionContent(
    onRequestPermission: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val context: Context = LocalContext.current
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = context.getString(R.string.get_permission),
            )
            Button(onClick = onRequestPermission) {
                Icon(
                    painter = painterResource(R.drawable.ic_camera),
                    contentDescription = "Camera",
                )
                Text(text = context.getString(R.string.grant_permission))
            }
        }
    }
}

@Preview
@Composable
private fun Preview_NoPermissionContent() {
    PermissionContent(
        onRequestPermission = {},
    )
}