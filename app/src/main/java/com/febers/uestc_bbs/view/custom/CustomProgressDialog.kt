package com.febers.uestc_bbs.view.custom

import android.content.Context
import androidx.appcompat.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView

import com.febers.uestc_bbs.R


class CustomProgressDialog @JvmOverloads constructor(mContext: Context,
                                                     title: String = "请稍侯") :
        AlertDialog(mContext, R.style.Theme_AppCompat_Dialog) {

    private val view: View = LayoutInflater.from(mContext).inflate(R.layout.dialog_progress, null)
    private val dialog: AlertDialog = AlertDialog.Builder(mContext).create()
    private val progressBar: ProgressBar
    private val titleText: TextView

    init {
        progressBar = view.findViewById(R.id.pb_progress)
        titleText = view.findViewById(R.id.progress_dialog_title)
        titleText.text = title
        dialog.setCanceledOnTouchOutside(false)
        dialog.setView(view)
    }

    override fun show() {
        dialog.show()
    }

    override fun hide() {
        dialog.hide()
    }

    override fun dismiss() {
        dialog.dismiss()
    }

    override fun isShowing(): Boolean {
        return dialog.isShowing
    }
}
