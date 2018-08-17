/*
 * Created by Febers at 18-8-17 下午3:59.
 * Copyright (c). All rights reserved.
 * Last modified 18-8-17 下午3:46.
 */

package com.febers.uestc_bbs.module.post.view

import com.febers.uestc_bbs.R
import com.febers.uestc_bbs.adaper.PostsViewPagerAdapter

import com.febers.uestc_bbs.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_post_pager.*

class TopicPagerFragment : BaseFragment(){
    override fun setContentView(): Int {
        return R.layout.fragment_post_pager
    }

    override fun initView() {
        val postsViewPagerAdapter = PostsViewPagerAdapter(childFragmentManager)
        view_pager_post.adapter = postsViewPagerAdapter
        view_pager_post.offscreenPageLimit = 3
        tab_layout_post.setupWithViewPager(view_pager_post)
    }
}