package com.febers.uestc_bbs.module.user.contract

import com.febers.uestc_bbs.base.BaseEvent
import com.febers.uestc_bbs.base.BasePresenter
import com.febers.uestc_bbs.base.BaseView
import com.febers.uestc_bbs.entity.UserDetailBean
import com.febers.uestc_bbs.entity.UserPostBean
import com.febers.uestc_bbs.entity.UserUpdateResultBean

interface UserContract {

    interface Model {
        fun userPostService(uid: Int, type: Int, page: Int)
        fun userDetailService(uid: Int)
        fun <T> userUpdateService(type: String, newValue: T, oldValue: T?)
    }

    interface View: BaseView {
        fun showUserPost(event: BaseEvent<UserPostBean>){}
        fun showUserDetail(event: BaseEvent<UserDetailBean>){}
        fun showUserUpdate(event: BaseEvent<UserUpdateResultBean>){}
    }

    abstract class Presenter(view: BaseView): BasePresenter<BaseView>(view) {
        abstract fun userPostRequest(uid: Int, type: Int, page: Int)
        abstract fun userPostResult(event: BaseEvent<UserPostBean>)

        abstract fun userDetailRequest(uid: Int)
        abstract fun userDetailResult(event: BaseEvent<UserDetailBean>)

        abstract fun <T> userUpdateRequest(type: String, newValue: T, oldValue: T? = null)
        abstract fun userUpdateResult(event: BaseEvent<UserUpdateResultBean>)
    }
}