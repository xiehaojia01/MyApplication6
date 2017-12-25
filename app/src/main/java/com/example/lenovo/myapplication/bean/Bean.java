package com.example.lenovo.myapplication.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/1.
 */

public class Bean {
    //http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0
    //http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0
    /**
     * song_list : [{"artist_id":"88","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-16","album_no":"5","lrclink":"http://musicdata.baidu.com/data2/lrc/ff3a10af94f191dfd5b6989448371e19/566311276/566311276.lrc","copy_type":"1","hot":"136659","all_artist_ting_uid":"2517","resource_type":"0","is_new":"1","rank_change":"0","rank":"1","all_artist_id":"88","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":277,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","song_id":"566310948","title":"骆驼","ting_uid":"2517","author":"薛之谦","album_id":"538777110","album_title":"渡 The Crossing","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"薛之谦","pic_radio":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000"},{"artist_id":"762","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-13","album_no":"1","lrclink":"http://musicdata.baidu.com/data2/lrc/5c867ae468f6f16d60513f320805de8f/566221461/566221461.lrc","copy_type":"1","hot":"82543","all_artist_ting_uid":"1376","resource_type":"0","is_new":"1","rank_change":"0","rank":"2","all_artist_id":"762","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"flac,320,256,128,64","file_duration":275,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"北京普天同乐文化传媒有限公司","song_id":"566221542","title":"北京·忘不了","ting_uid":"1376","author":"龙梅子","album_id":"566221537","album_title":"北京·忘不了","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"龙梅子","pic_radio":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/10e06807a15c04ba2394f8e428975346/566221280/566221280.jpg@s_1,w_1000,h_1000"},{"artist_id":"88","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-03","album_no":"3","lrclink":"http://musicdata.baidu.com/data2/lrc/b1f98ad984e18662e13c93253f41089b/565031735/565031735.lrc","copy_type":"1","hot":"204704","all_artist_ting_uid":"2517","resource_type":"0","is_new":"1","rank_change":"0","rank":"3","all_artist_id":"88","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"flac,320,256,128,64","file_duration":255,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","song_id":"565030085","title":"像风一样","ting_uid":"2517","author":"薛之谦","album_id":"538777110","album_title":"渡 The Crossing","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"薛之谦","pic_radio":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000"},{"artist_id":"88","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-10","album_no":"9","lrclink":"http://musicdata.baidu.com/data2/lrc/9643170e9345673054dfa042cc482344/566103835/566103835.lrc","copy_type":"1","hot":"179107","all_artist_ting_uid":"2517","resource_type":"0","is_new":"1","rank_change":"0","rank":"4","all_artist_id":"88","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":213,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","song_id":"566055824","title":"渡","ting_uid":"2517","author":"薛之谦","album_id":"538777110","album_title":"渡 The Crossing","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"薛之谦","pic_radio":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000"},{"artist_id":"939","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-17","album_no":"1","lrclink":"http://musicdata.baidu.com/data2/lrc/45c2760b873f893637bd5643641027be/566407049/566407049.lrc","copy_type":"1","hot":"56486","all_artist_ting_uid":"1425","resource_type":"0","is_new":"1","rank_change":"0","rank":"5","all_artist_id":"939","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256","file_duration":274,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"vip","info":"","has_filmtv":"0","si_proxycompany":"深圳腾讯计算机系统有限公司索尼音乐","song_id":"566143900","title":"我想念我自己","ting_uid":"1425","author":"彭佳慧","album_id":"566143896","album_title":"我想念我自己","is_first_publish":0,"havehigh":0,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"彭佳慧","pic_radio":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/9b5f153350c0dc4c28f98fb336e82db7/566143897/566143897.jpg@s_1,w_1000,h_1000"},{"artist_id":"5026","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-23","album_no":"1","lrclink":"http://musicdata.baidu.com/data2/lrc/af8829f741bb8cdf714cf80d1d56cc0f/566653268/566653268.lrc","copy_type":"1","hot":"55247","all_artist_ting_uid":"67631","resource_type":"0","is_new":"1","rank_change":"0","rank":"6","all_artist_id":"5026","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"256,128,64","file_duration":187,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"first,vip","info":"","has_filmtv":"0","si_proxycompany":"深圳腾讯计算机系统有限公司索尼音乐","song_id":"566408221","title":"带你一起丢手绢","ting_uid":"67631","author":"黄渤","album_id":"566408218","album_title":"带你一起丢手绢","is_first_publish":0,"havehigh":0,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"黄渤","pic_radio":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/d5bad6cee3c4b4f782f1b75240a31adc/566408219/566408219.jpg@s_1,w_1000,h_1000"},{"artist_id":"166","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_90,h_90","country":"港台","area":"1","publishtime":"2017-11-16","album_no":"0","lrclink":"http://musicdata.baidu.com/data2/lrc/a662e3fddf121d14f4032ea330fb614b/566327113/566327113.lrc","copy_type":"3","hot":"44908","all_artist_ting_uid":"1118","resource_type":"0","is_new":"1","rank_change":"0","rank":"7","all_artist_id":"166","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320","file_duration":308,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"潮水音乐","song_id":"566327116","title":"永恒的印记","ting_uid":"1118","author":"张信哲","album_id":"566327114","album_title":"永恒的印记","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"张信哲","pic_radio":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/58835dbc6e51e200fb574f287cad88e7/566326892/566326892.jpg@s_1,w_1000,h_1000"},{"artist_id":"1665","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-15","album_no":"1","lrclink":"http://musicdata.baidu.com/data2/lrc/0379b43d87591e8927046c03ea0710b2/566512048/566512048.lrc","copy_type":"1","hot":"43399","all_artist_ting_uid":"2611","resource_type":"0","is_new":"1","rank_change":"0","rank":"8","all_artist_id":"1665","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":261,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","song_id":"566307540","title":"嗜睡症","ting_uid":"2611","author":"刘惜君","album_id":"566307536","album_title":"嗜睡症","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"刘惜君","pic_radio":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/824e2ead1f083eba4d9ef79416973217/566307538/566307538.jpg@s_1,w_1000,h_1000"},{"artist_id":"776","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-20","album_no":"1","lrclink":"http://musicdata.baidu.com/data2/lrc/25bd6bb35de2983103083f38892c56bb/566519305/566519305.lrc","copy_type":"1","hot":"36736","all_artist_ting_uid":"1383","resource_type":"0","is_new":"1","rank_change":"0","rank":"9","all_artist_id":"776","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":253,"has_mv_mobile":0,"versions":"影视原声","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"电影《心理罪之城市之光》回归主题曲","has_filmtv":"0","si_proxycompany":"北京乐加音乐咨询有限公司","song_id":"566519317","title":"城市之光","ting_uid":"1383","author":"李健","album_id":"566519315","album_title":"城市之光","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"李健","pic_radio":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/908baf6b99b1c3f4b9210d4e5ebbbed4/566519298/566519298.jpg@s_1,w_1000,h_1000"},{"artist_id":"1778","language":"国语","pic_big":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_150,h_150","pic_small":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-13","album_no":"1","lrclink":"http://musicdata.baidu.com/data2/lrc/4c955607f93d62981361625c472a64c2/566214815/566214815.lrc","copy_type":"1","hot":"31433","all_artist_ting_uid":"1607","resource_type":"0","is_new":"1","rank_change":"3","rank":"10","all_artist_id":"1778","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":203,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-太合麦田 ","song_id":"566214242","title":"Tell me what you want","ting_uid":"1607","author":"MIC男团","album_id":"566214240","album_title":"Tell Me What You Want","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"MIC男团","pic_radio":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_300,h_300","pic_s500":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_500,h_500","pic_premium":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_500,h_500","pic_huge":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_1000,h_1000","album_500_500":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://musicdata.baidu.com/data2/pic/95cc4ac43437c68905b37980e780ff3f/566214065/566214065.jpg@s_1,w_1000,h_1000"}]
     * billboard : {"billboard_type":"1","billboard_no":"2395","update_date":"2017-12-01","billboard_songnum":"143","havemore":1,"name":"新歌榜","comment":"该榜单是根据百度音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次","pic_s192":"http://b.hiphotos.baidu.com/ting/pic/item/9922720e0cf3d7caf39ebc10f11fbe096b63a968.jpg","pic_s640":"http://c.hiphotos.baidu.com/ting/pic/item/f7246b600c33874495c4d089530fd9f9d62aa0c6.jpg","pic_s444":"http://d.hiphotos.baidu.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg","pic_s260":"http://b.hiphotos.baidu.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg","pic_s210":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_c49310115801d43d42a98fdc357f6057.jpg","web_url":"http://music.baidu.com/top/new"}
     * error_code : 22000
     */

    private BillboardBean billboard;
    private int error_code;
    private List<SongListBean> song_list;

    public BillboardBean getBillboard() {
        return billboard;
    }

    public void setBillboard(BillboardBean billboard) {
        this.billboard = billboard;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<SongListBean> getSong_list() {
        return song_list;
    }

    public void setSong_list(List<SongListBean> song_list) {
        this.song_list = song_list;
    }

    public static class BillboardBean {
        /**
         * billboard_type : 1
         * billboard_no : 2395
         * update_date : 2017-12-01
         * billboard_songnum : 143
         * havemore : 1
         * name : 新歌榜
         * comment : 该榜单是根据百度音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次
         * pic_s192 : http://b.hiphotos.baidu.com/ting/pic/item/9922720e0cf3d7caf39ebc10f11fbe096b63a968.jpg
         * pic_s640 : http://c.hiphotos.baidu.com/ting/pic/item/f7246b600c33874495c4d089530fd9f9d62aa0c6.jpg
         * pic_s444 : http://d.hiphotos.baidu.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg
         * pic_s260 : http://b.hiphotos.baidu.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg
         * pic_s210 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_c49310115801d43d42a98fdc357f6057.jpg
         * web_url : http://music.baidu.com/top/new
         */

        private String billboard_type;
        private String billboard_no;
        private String update_date;
        private String billboard_songnum;
        private int havemore;
        private String name;
        private String comment;
        private String pic_s192;
        private String pic_s640;
        private String pic_s444;
        private String pic_s260;
        private String pic_s210;
        private String web_url;

        public String getBillboard_type() {
            return billboard_type;
        }

        public void setBillboard_type(String billboard_type) {
            this.billboard_type = billboard_type;
        }

        public String getBillboard_no() {
            return billboard_no;
        }

        public void setBillboard_no(String billboard_no) {
            this.billboard_no = billboard_no;
        }

        public String getUpdate_date() {
            return update_date;
        }

        public void setUpdate_date(String update_date) {
            this.update_date = update_date;
        }

        public String getBillboard_songnum() {
            return billboard_songnum;
        }

        public void setBillboard_songnum(String billboard_songnum) {
            this.billboard_songnum = billboard_songnum;
        }

        public int getHavemore() {
            return havemore;
        }

        public void setHavemore(int havemore) {
            this.havemore = havemore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getPic_s192() {
            return pic_s192;
        }

        public void setPic_s192(String pic_s192) {
            this.pic_s192 = pic_s192;
        }

        public String getPic_s640() {
            return pic_s640;
        }

        public void setPic_s640(String pic_s640) {
            this.pic_s640 = pic_s640;
        }

        public String getPic_s444() {
            return pic_s444;
        }

        public void setPic_s444(String pic_s444) {
            this.pic_s444 = pic_s444;
        }

        public String getPic_s260() {
            return pic_s260;
        }

        public void setPic_s260(String pic_s260) {
            this.pic_s260 = pic_s260;
        }

        public String getPic_s210() {
            return pic_s210;
        }

        public void setPic_s210(String pic_s210) {
            this.pic_s210 = pic_s210;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }
    }

    public static class SongListBean {
        /**
         * artist_id : 88
         * language : 国语
         * pic_big : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_150,h_150
         * pic_small : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_90,h_90
         * country : 内地
         * area : 0
         * publishtime : 2017-11-16
         * album_no : 5
         * lrclink : http://musicdata.baidu.com/data2/lrc/ff3a10af94f191dfd5b6989448371e19/566311276/566311276.lrc
         * copy_type : 1
         * hot : 136659
         * all_artist_ting_uid : 2517
         * resource_type : 0
         * is_new : 1
         * rank_change : 0
         * rank : 1
         * all_artist_id : 88
         * style :
         * del_status : 0
         * relate_status : 0
         * toneid : 0
         * all_rate : 64,128,256,320,flac
         * file_duration : 277
         * has_mv_mobile : 0
         * versions :
         * bitrate_fee : {"0":"0|0","1":"0|0"}
         * biaoshi : first,lossless
         * info :
         * has_filmtv : 0
         * si_proxycompany : TAIHE MUSIC GROUP
         * song_id : 566310948
         * title : 骆驼
         * ting_uid : 2517
         * author : 薛之谦
         * album_id : 538777110
         * album_title : 渡 The Crossing
         * is_first_publish : 0
         * havehigh : 2
         * charge : 0
         * has_mv : 0
         * learn : 0
         * song_source : web
         * piao_id : 0
         * korean_bb_song : 0
         * resource_type_ext : 0
         * mv_provider : 0000000000
         * artist_name : 薛之谦
         * pic_radio : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_300,h_300
         * pic_s500 : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500
         * pic_premium : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500
         * pic_huge : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000
         * album_500_500 : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500
         * album_800_800 :
         * album_1000_1000 : http://musicdata.baidu.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000
         */

        private String artist_id;
        private String language;
        private String pic_big;
        private String pic_small;
        private String country;
        private String area;
        private String publishtime;
        private String album_no;
        private String lrclink;
        private String copy_type;
        private String hot;
        private String all_artist_ting_uid;
        private String resource_type;
        private String is_new;
        private String rank_change;
        private String rank;
        private String all_artist_id;
        private String style;
        private String del_status;
        private String relate_status;
        private String toneid;
        private String all_rate;
        private int file_duration;
        private int has_mv_mobile;
        private String versions;
        private String bitrate_fee;
        private String biaoshi;
        private String info;
        private String has_filmtv;
        private String si_proxycompany;
        private String song_id;
        private String title;
        private String ting_uid;
        private String author;
        private String album_id;
        private String album_title;
        private int is_first_publish;
        private int havehigh;
        private int charge;
        private int has_mv;
        private int learn;
        private String song_source;
        private String piao_id;
        private String korean_bb_song;
        private String resource_type_ext;
        private String mv_provider;
        private String artist_name;
        private String pic_radio;
        private String pic_s500;
        private String pic_premium;
        private String pic_huge;
        private String album_500_500;
        private String album_800_800;
        private String album_1000_1000;

        public String getArtist_id() {
            return artist_id;
        }

        public void setArtist_id(String artist_id) {
            this.artist_id = artist_id;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public String getPic_small() {
            return pic_small;
        }

        public void setPic_small(String pic_small) {
            this.pic_small = pic_small;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPublishtime() {
            return publishtime;
        }

        public void setPublishtime(String publishtime) {
            this.publishtime = publishtime;
        }

        public String getAlbum_no() {
            return album_no;
        }

        public void setAlbum_no(String album_no) {
            this.album_no = album_no;
        }

        public String getLrclink() {
            return lrclink;
        }

        public void setLrclink(String lrclink) {
            this.lrclink = lrclink;
        }

        public String getCopy_type() {
            return copy_type;
        }

        public void setCopy_type(String copy_type) {
            this.copy_type = copy_type;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getAll_artist_ting_uid() {
            return all_artist_ting_uid;
        }

        public void setAll_artist_ting_uid(String all_artist_ting_uid) {
            this.all_artist_ting_uid = all_artist_ting_uid;
        }

        public String getResource_type() {
            return resource_type;
        }

        public void setResource_type(String resource_type) {
            this.resource_type = resource_type;
        }

        public String getIs_new() {
            return is_new;
        }

        public void setIs_new(String is_new) {
            this.is_new = is_new;
        }

        public String getRank_change() {
            return rank_change;
        }

        public void setRank_change(String rank_change) {
            this.rank_change = rank_change;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getAll_artist_id() {
            return all_artist_id;
        }

        public void setAll_artist_id(String all_artist_id) {
            this.all_artist_id = all_artist_id;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getDel_status() {
            return del_status;
        }

        public void setDel_status(String del_status) {
            this.del_status = del_status;
        }

        public String getRelate_status() {
            return relate_status;
        }

        public void setRelate_status(String relate_status) {
            this.relate_status = relate_status;
        }

        public String getToneid() {
            return toneid;
        }

        public void setToneid(String toneid) {
            this.toneid = toneid;
        }

        public String getAll_rate() {
            return all_rate;
        }

        public void setAll_rate(String all_rate) {
            this.all_rate = all_rate;
        }

        public int getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(int file_duration) {
            this.file_duration = file_duration;
        }

        public int getHas_mv_mobile() {
            return has_mv_mobile;
        }

        public void setHas_mv_mobile(int has_mv_mobile) {
            this.has_mv_mobile = has_mv_mobile;
        }

        public String getVersions() {
            return versions;
        }

        public void setVersions(String versions) {
            this.versions = versions;
        }

        public String getBitrate_fee() {
            return bitrate_fee;
        }

        public void setBitrate_fee(String bitrate_fee) {
            this.bitrate_fee = bitrate_fee;
        }

        public String getBiaoshi() {
            return biaoshi;
        }

        public void setBiaoshi(String biaoshi) {
            this.biaoshi = biaoshi;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getHas_filmtv() {
            return has_filmtv;
        }

        public void setHas_filmtv(String has_filmtv) {
            this.has_filmtv = has_filmtv;
        }

        public String getSi_proxycompany() {
            return si_proxycompany;
        }

        public void setSi_proxycompany(String si_proxycompany) {
            this.si_proxycompany = si_proxycompany;
        }

        public String getSong_id() {
            return song_id;
        }

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTing_uid() {
            return ting_uid;
        }

        public void setTing_uid(String ting_uid) {
            this.ting_uid = ting_uid;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public int getIs_first_publish() {
            return is_first_publish;
        }

        public void setIs_first_publish(int is_first_publish) {
            this.is_first_publish = is_first_publish;
        }

        public int getHavehigh() {
            return havehigh;
        }

        public void setHavehigh(int havehigh) {
            this.havehigh = havehigh;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getHas_mv() {
            return has_mv;
        }

        public void setHas_mv(int has_mv) {
            this.has_mv = has_mv;
        }

        public int getLearn() {
            return learn;
        }

        public void setLearn(int learn) {
            this.learn = learn;
        }

        public String getSong_source() {
            return song_source;
        }

        public void setSong_source(String song_source) {
            this.song_source = song_source;
        }

        public String getPiao_id() {
            return piao_id;
        }

        public void setPiao_id(String piao_id) {
            this.piao_id = piao_id;
        }

        public String getKorean_bb_song() {
            return korean_bb_song;
        }

        public void setKorean_bb_song(String korean_bb_song) {
            this.korean_bb_song = korean_bb_song;
        }

        public String getResource_type_ext() {
            return resource_type_ext;
        }

        public void setResource_type_ext(String resource_type_ext) {
            this.resource_type_ext = resource_type_ext;
        }

        public String getMv_provider() {
            return mv_provider;
        }

        public void setMv_provider(String mv_provider) {
            this.mv_provider = mv_provider;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public void setArtist_name(String artist_name) {
            this.artist_name = artist_name;
        }

        public String getPic_radio() {
            return pic_radio;
        }

        public void setPic_radio(String pic_radio) {
            this.pic_radio = pic_radio;
        }

        public String getPic_s500() {
            return pic_s500;
        }

        public void setPic_s500(String pic_s500) {
            this.pic_s500 = pic_s500;
        }

        public String getPic_premium() {
            return pic_premium;
        }

        public void setPic_premium(String pic_premium) {
            this.pic_premium = pic_premium;
        }

        public String getPic_huge() {
            return pic_huge;
        }

        public void setPic_huge(String pic_huge) {
            this.pic_huge = pic_huge;
        }

        public String getAlbum_500_500() {
            return album_500_500;
        }

        public void setAlbum_500_500(String album_500_500) {
            this.album_500_500 = album_500_500;
        }

        public String getAlbum_800_800() {
            return album_800_800;
        }

        public void setAlbum_800_800(String album_800_800) {
            this.album_800_800 = album_800_800;
        }

        public String getAlbum_1000_1000() {
            return album_1000_1000;
        }

        public void setAlbum_1000_1000(String album_1000_1000) {
            this.album_1000_1000 = album_1000_1000;
        }
    }
}
