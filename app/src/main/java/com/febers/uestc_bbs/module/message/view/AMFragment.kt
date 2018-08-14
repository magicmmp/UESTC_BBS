/*
 * Created by Febers at 18-8-14 上午1:46.
 * Copyright (c). All rights reserved.
 * Last modified 18-8-14 上午1:46.
 */

package com.febers.uestc_bbs.module.message.view

import android.util.Log.i
import com.febers.uestc_bbs.R
import com.febers.uestc_bbs.base.BaseFragment

/**
 * @我的通知
 */
class AMFragment: BaseFragment() {

    override fun setContentView(): Int {
        return R.layout.fragment_sub_message
    }

    override fun initView() {

    }

    override fun lazyLoad() {

    }

    override fun onHiddenChanged(hidden: Boolean) {
        i("AMFragment", "$hidden")
        super.onHiddenChanged(hidden)
    }
}