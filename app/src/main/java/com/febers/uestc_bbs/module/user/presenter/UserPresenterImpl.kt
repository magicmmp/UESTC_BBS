package com.febers.uestc_bbs.module.user.presenter

import com.febers.uestc_bbs.base.BaseEvent
import com.febers.uestc_bbs.entity.UserDetailBean
import com.febers.uestc_bbs.entity.UserPostBean
import com.febers.uestc_bbs.entity.UserUpdateResultBean
import com.febers.uestc_bbs.module.user.contract.UserContract
import com.febers.uestc_bbs.module.user.model.UserModelImpl

class UserPresenterImpl(var view: UserContract.View): UserContract.Presenter(view) {

    override fun userPostRequest(uid: Int, type: Int, page: Int) {
        val userModel: UserContract.Model = UserModelImpl(this)
        userModel.userPostService(uid, type, page)
    }

    override fun userPostResult(event: BaseEvent<UserPostBean>) {
        view.showUserPost(event)
    }

    override fun userDetailRequest(uid: Int) {
        val userModel: UserContract.Model = UserModelImpl(this)
        userModel.userDetailService(uid)
    }

    override fun userDetailResult(event: BaseEvent<UserDetailBean>) {
        view.showUserDetail(event)
    }

    override fun <T> userUpdateRequest(type: String, newValue: T, oldValue: T?) {
        val userModel: UserContract.Model = UserModelImpl(this)
        userModel.userUpdateService(type, newValue, oldValue)
    }

    override fun userUpdateResult(event: BaseEvent<UserUpdateResultBean>) {
        view.showUserUpdate(event)
    }
}