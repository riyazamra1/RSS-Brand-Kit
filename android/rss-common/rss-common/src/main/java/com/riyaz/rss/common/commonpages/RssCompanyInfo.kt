package com.riyaz.rss.common.commonpages

import com.riyaz.rss.common.RssBrand

data class RssCompanyInfo(
    val companyName: String = RssBrand.COMPANY_NAME,
    val website: String = RssBrand.WEBSITE,
    val email: String = RssBrand.EMAIL,
    val phone: String = RssBrand.PHONE
)
