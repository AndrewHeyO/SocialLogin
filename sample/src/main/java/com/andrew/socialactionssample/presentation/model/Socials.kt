package com.andrew.socialactionssample.presentation.model

import androidx.annotation.DrawableRes
import com.andrew.social.login.core.SocialType
import com.andrew.socialactionssample.R

/**
 * Created by Andrew on 17.06.2018.
 */

data class SocialModel(
    val socialType: SocialType,
    val socialViewType: SocialViewType? = SocialViewType.resolve(socialType),
    var code: String = ""
)

enum class SocialViewType(
    val socialType: SocialType,
    @DrawableRes val drawableRes: Int
) {
    VK(SocialType.VK, R.drawable.logo_vk),
    TWITTER(SocialType.TWITTER, R.drawable.logo_twitter),
    INSTAGRAM(SocialType.INSTAGRAM, R.drawable.logo_instagram),
    FACEBOOK(SocialType.FACEBOOK, R.drawable.logo_facebook),
    GOOGLE(SocialType.GOOGLE, R.drawable.logo_google),
    LINKED_IN(SocialType.LINKED_IN, R.drawable.logo_linked_in),
    GITHUB(SocialType.GITHUB, R.drawable.logo_github),
    AMAZON(SocialType.AMAZON, R.drawable.logo_amazon),
    MICROSOFT(SocialType.MICROSOFT, R.drawable.logo_microsoft),
    YAHOO(SocialType.YAHOO, R.drawable.logo_yahoo);

    companion object {
        fun resolve(socialType: SocialType): SocialViewType? = values().firstOrNull { it.socialType == socialType }
    }
}