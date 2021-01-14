package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.2OL  reason: invalid class name */
public class AnonymousClass2OL {
    public static volatile AnonymousClass2OL A05;
    public boolean A00 = false;
    public final SharedPreferences A01;
    public final C002701k A02;
    public final AnonymousClass2OK A03;
    public final AnonymousClass2OQ A04;

    public AnonymousClass2OL(C002701k r2, AnonymousClass2OQ r3, AnonymousClass2OK r4, AnonymousClass022 r5) {
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A01 = r5.A01(AnonymousClass020.A02);
    }

    public static AnonymousClass2OL A00() {
        if (A05 == null) {
            synchronized (AnonymousClass2OL.class) {
                if (A05 == null) {
                    C002701k A002 = C002701k.A00();
                    if (AnonymousClass2OQ.A01 == null) {
                        synchronized (AnonymousClass2OQ.class) {
                            if (AnonymousClass2OQ.A01 == null) {
                                AnonymousClass00D A003 = AnonymousClass00D.A00();
                                AnonymousClass2OQ r3 = new AnonymousClass2OQ();
                                String A0E = A003.A0E();
                                Map map = r3.A00;
                                map.put("device_id", A0E);
                                map.put("app_build", "beta");
                                map.put("release_channel", "beta");
                                map.put("app_version", "2.21.2.4");
                                map.put("os_version", Build.VERSION.RELEASE);
                                map.put("platform", "android");
                                AnonymousClass2OQ.A01 = r3;
                            }
                        }
                    }
                    AnonymousClass2OQ r32 = AnonymousClass2OQ.A01;
                    if (AnonymousClass2OK.A02 == null) {
                        synchronized (AnonymousClass2OK.class) {
                            if (AnonymousClass2OK.A02 == null) {
                                AnonymousClass2OK.A02 = new AnonymousClass2OK(new AnonymousClass2OJ());
                            }
                        }
                    }
                    A05 = new AnonymousClass2OL(A002, r32, AnonymousClass2OK.A02, AnonymousClass022.A00());
                }
            }
        }
        return A05;
    }

    public final void A01() {
        if (!this.A00) {
            AnonymousClass2OK r5 = this.A03;
            AnonymousClass2OQ r4 = this.A04;
            List<AnonymousClass2OO> list = r5.A00.A00;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (AnonymousClass2OO r6 : list) {
                AnonymousClass2OP r0 = r6.A00;
                if (r0 == null || r0.AB0(r4)) {
                    String str = r6.A02;
                    Map map = r4.A00;
                    if (map.containsKey(str)) {
                        MessageDigest messageDigest = r5.A01;
                        messageDigest.update(r6.A01.getBytes());
                        new BigInteger(1, messageDigest.digest(((String) map.get(str)).getBytes())).mod(new BigInteger(Integer.toString(SearchActionVerificationClientService.NOTIFICATION_ID))).intValue();
                        Iterator it = r6.A03.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException(AnonymousClass008.A0K(str, " has not been set on UserInfo"));
                    }
                }
            }
            SparseArray sparseArray = new SparseArray();
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw null;
            }
            C002701k r42 = this.A02;
            synchronized (r42) {
                SharedPreferences.Editor edit = r42.A0K.edit();
                C002001d.A36("ab_props:disable_prewarm", (String) sparseArray.get(15), edit);
                C002001d.A34("ab_props:scroll_perf", (String) sparseArray.get(22), edit);
                C002001d.A36("ab_props:progressive_jpeg_thumbnail_enabled", (String) sparseArray.get(24), edit);
                C002001d.A36("ab_props:reusable_video_player_enabled", (String) sparseArray.get(46), edit);
                C002001d.A34("ab_props:buffer_for_playback", (String) sparseArray.get(25), edit);
                C002001d.A36("ab_props:watls_enabled", (String) sparseArray.get(48), edit);
                C002001d.A36("ab_props:watls_no_dns", (String) sparseArray.get(58), edit);
                C002001d.A36("ab_props:watls_prefer_ip6", (String) sparseArray.get(59), edit);
                C002001d.A36("ab_props:watls_early_data", (String) sparseArray.get(65), edit);
                C002001d.A36("ab_props:watls_enable_early_data_http_post", (String) sparseArray.get(311), edit);
                C002001d.A36("ab_props:watls_enable_early_data_http_get", (String) sparseArray.get(312), edit);
                C002001d.A34("ab_props:media_autodownload_thread_pool_size", (String) sparseArray.get(49), edit);
                C002001d.A34("ab_props:autodownload_priority_policy", (String) sparseArray.get(60), edit);
                C002001d.A36("ab_props:offline_text_color_change", (String) sparseArray.get(71), edit);
                C002001d.A36("ab_props:mms_tcp_congestion_bbr", (String) sparseArray.get(72), edit);
                C002001d.A36("ab_props:camelot", (String) sparseArray.get(177), edit);
                C002001d.A36("ab_props:roundtable", (String) sparseArray.get(178), edit);
                C002001d.A36("ab_props:room_messenger_upgrade", (String) sparseArray.get(179), edit);
                C002001d.A36("ab_props:whats_my_number_enabled", (String) sparseArray.get(75), edit);
                C002001d.A36("ab_props:sms_retriever_first", (String) sparseArray.get(91), edit);
                C002001d.A36("ab_props:offline_aa_test_config", (String) sparseArray.get(95), edit);
                C002001d.A36("ab_props:offline_aa_test_config_v2", (String) sparseArray.get(96), edit);
                C002001d.A36("ab_props:consumer_reg_profile_design", (String) sparseArray.get(77), edit);
                C002001d.A36("ab_props:status_fast_streaming_enable_test", (String) sparseArray.get(79), edit);
                C002001d.A34("ab_props:status_fast_streaming_initial_buffering_second_test", (String) sparseArray.get(80), edit);
                C002001d.A34("ab_props:status_fast_streaming_unstall_second_test", (String) sparseArray.get(81), edit);
                C002001d.A33("ab_props:status_fast_streaming_unstall_multiplier_test", (String) sparseArray.get(82), edit);
                C002001d.A33("ab_props:status_aggressive_prefetch_seconds", (String) sparseArray.get(92), edit);
                C002001d.A34("ab_props:image_max_edge_test", (String) sparseArray.get(86), edit);
                C002001d.A34("ab_props:status_image_max_edge_test", (String) sparseArray.get(87), edit);
                C002001d.A34("ab_props:image_compression_quality_test", (String) sparseArray.get(88), edit);
                C002001d.A34("ab_props:status_image_compression_quality_test", (String) sparseArray.get(89), edit);
                C002001d.A34("ab_props:image_quality_group", (String) sparseArray.get(90), edit);
                C002001d.A36("ab_props:stream_progressive_jpeg_enabled", (String) sparseArray.get(97), edit);
                C002001d.A36("ab_props:liger_enabled", (String) sparseArray.get(98), edit);
                C002001d.A36("ab_props:liger_quic_enabled", (String) sparseArray.get(99), edit);
                C002001d.A36("ab_props:mms4_pps_download_thumbnail", (String) sparseArray.get(101), edit);
                C002001d.A36("ab_props:mms4_pps_download_full_size", (String) sparseArray.get(102), edit);
                C002001d.A36("ab_props:pjeg_data_saver_enabled", (String) sparseArray.get(103), edit);
                C002001d.A36("ab_props:pjpeg_status_data_saver_enabled", (String) sparseArray.get(109), edit);
                C002001d.A36("ab_props:pjpeg_chat_data_saver_enabled", (String) sparseArray.get(110), edit);
                C002001d.A34("ab_props:download_full_pjpeg_max_edge", (String) sparseArray.get(112), edit);
                C002001d.A34("ab_props:download_full_pjpeg_max_edge_status", (String) sparseArray.get(113), edit);
                C002001d.A34("ab_props:higher_image_max_edge", (String) sparseArray.get(114), edit);
                C002001d.A34("ab_props:higher_image_max_edge_status", (String) sparseArray.get(115), edit);
                C002001d.A34("ab_props:image_max_kb_for_skipping_compression", (String) sparseArray.get(126), edit);
                C002001d.A34("ab_props:higher_image_quality", (String) sparseArray.get(116), edit);
                C002001d.A34("ab_props:higher_image_quality_status", (String) sparseArray.get(117), edit);
                C002001d.A36("ab_props:new_wam_runtime_enabled", (String) sparseArray.get(118), edit);
                C002001d.A34("ab_props:new_wam_runtime_beaconing", (String) sparseArray.get(119), edit);
                C002001d.A36("ab_props:status_collapse_muted", (String) sparseArray.get(120), edit);
                C002001d.A36("ab_props:photo_upload_bandwidth_estimation_enabled", (String) sparseArray.get(121), edit);
                C002001d.A36("ab_props:photo_download_bandwidth_estimation_enabled", (String) sparseArray.get(122), edit);
                C002001d.A36("ab_props:pjpeg_force_download_mid_quality_enabled", (String) sparseArray.get(123), edit);
                C002001d.A36("ab_props:dns_over_https_enabled", (String) sparseArray.get(124), edit);
                C002001d.A36("ab_props:dns_over_https_interleave_enabled", (String) sparseArray.get(133), edit);
                C002001d.A36("ab_props:camera_core_integration_enabled", (String) sparseArray.get(125), edit);
                C002001d.A34("ab_props:bandwidth_estimation_algorithm", (String) sparseArray.get(127), edit);
                C002001d.A36("ab_props:bandwidth_estimation_adjacent_hours_optimization", (String) sparseArray.get(154), edit);
                C002001d.A36("ab_props:lazy_camera_view_inflation", (String) sparseArray.get(128), edit);
                C002001d.A34("ab_props:sender_higher_quality_bandwidth_threshold", (String) sparseArray.get(129), edit);
                C002001d.A34("ab_props:receiver_higher_quality_bandwidth_threshold", (String) sparseArray.get(130), edit);
                C002001d.A36("ab_props:photo_download_realtime_bandwidth_enabled", (String) sparseArray.get(131), edit);
                C002001d.A36("ab_props:wamsys_registration_enabled", (String) sparseArray.get(132), edit);
                C002001d.A34("ab_props:wamsys_registration_value", (String) sparseArray.get(134), edit);
                C002001d.A36("ab_props:wamsys_registration_v3_enabled", (String) sparseArray.get(140), edit);
                C002001d.A36("ab_props:wamsys_registration_v4_enabled", (String) sparseArray.get(143), edit);
                C002001d.A36("ab_props:wamsys_registration_v5_enabled", (String) sparseArray.get(145), edit);
                C002001d.A36("ab_props:wamsys_registration_v6_enabled", (String) sparseArray.get(148), edit);
                C002001d.A34("ab_props:mms_chatd_resume_check_override", (String) sparseArray.get(136), edit);
                C002001d.A36("ab_props:disable_status_autodownload_inactive_users", (String) sparseArray.get(138), edit);
                C002001d.A34("ab_props:auto_expo_int_field", (String) sparseArray.get(142), edit);
                C002001d.A34("ab_props:auto_expo_status_tab_open", (String) sparseArray.get(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT), edit);
                C002001d.A36("ab_props:wamsys_mms_enabled", (String) sparseArray.get(147), edit);
                C002001d.A36("ab_props:mms_media_conn_persist_enabled", (String) sparseArray.get(149), edit);
                C002001d.A36("ab_props:mms_media_conn_foreground_only_enabled", (String) sparseArray.get(150), edit);
                C002001d.A35("ab_props:android_camera2_support_level", (String) sparseArray.get(151), edit);
                C002001d.A36("ab_props:connect_with_friends_dialog_enabled", (String) sparseArray.get(152), edit);
                C002001d.A34("ab_props:max_keys", (String) sparseArray.get(156), edit);
                C002001d.A34("ab_props:video_max_bitrate", (String) sparseArray.get(157), edit);
                C002001d.A36("ab_props:work_manager_hourly_cron", (String) sparseArray.get(161), edit);
                C002001d.A36("ab_props:work_manager_ntp_sync", (String) sparseArray.get(170), edit);
                C002001d.A34("ab_props:media_max_autodownload_wifi_mb", (String) sparseArray.get(168), edit);
                C002001d.A34("ab_props:media_max_autodownload", (String) sparseArray.get(169), edit);
                C002001d.A34("ab_props:status_video_max_duration", (String) sparseArray.get(175), edit);
                C002001d.A36("ab_props:voip_fix_converter_memory_leak", (String) sparseArray.get(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH), edit);
                C002001d.A36("ab_props:enable_non_wake_up_alarm_ping", (String) sparseArray.get(180), edit);
                C002001d.A36("ab_props:async_init_after_thread_idle", (String) sparseArray.get(181), edit);
                C002001d.A36("ab_props:wamsys_decryption_individual_enabled", (String) sparseArray.get(182), edit);
                C002001d.A36("ab_props:wamsys_encryption_individual_enabled", (String) sparseArray.get(187), edit);
                C002001d.A36("ab_props:wamsys_decryption_group_enabled", (String) sparseArray.get(188), edit);
                C002001d.A36("ab_props:wamsys_encryption_group_enabled", (String) sparseArray.get(189), edit);
                C002001d.A35("ab_props:android_test_scheduler_api", (String) sparseArray.get(183), edit);
                C002001d.A35("ab_props:android_test_scheduler_period_impl", (String) sparseArray.get(184), edit);
                C002001d.A34("ab_props:android_test_scheduler_period_hours", (String) sparseArray.get(185), edit);
                C002001d.A34("ab_props:android_test_scheduler_run_seconds", (String) sparseArray.get(186), edit);
                C002001d.A36("ab_props:transsion_badging", (String) sparseArray.get(190), edit);
                C002001d.A34("ab_props:enable_hash_based_hybrid_codecs_mask", (String) sparseArray.get(191), edit);
                C002001d.A34("ab_props:upload_thread_lower_priority", (String) sparseArray.get(192), edit);
                C002001d.A36("ab_props:async_data_load_on_startup", (String) sparseArray.get(196), edit);
                C002001d.A36("ab_props:enable_long_running_job_monitor", (String) sparseArray.get(281), edit);
                C002001d.A36("ab_props:bloks_use_minscript_android", (String) sparseArray.get(198), edit);
                C002001d.A36("ab_props:load_chats_lazily", (String) sparseArray.get(199), edit);
                C002001d.A36("ab_props:status_ranking", (String) sparseArray.get(56), edit);
                C002001d.A34("ab_props:db_migration_low_latency_kill_switch_latency", (String) sparseArray.get(200), edit);
                C002001d.A36("ab_props:db_migration_low_latency_kill_switch", (String) sparseArray.get(201), edit);
                C002001d.A35("ab_props:db_migration_low_latency_kill_switch_experiment", (String) sparseArray.get(203), edit);
                C002001d.A35("ab_props:db_migration_data_source_v1", (String) sparseArray.get(205), edit);
                C002001d.A35("ab_props:db_migration_data_source_v2", (String) sparseArray.get(206), edit);
                C002001d.A35("ab_props:db_migration_level_reset", (String) sparseArray.get(207), edit);
                C002001d.A35("ab_props:db_migration_level_keep", (String) sparseArray.get(208), edit);
                C002001d.A35("ab_props:db_migration_level_migrate", (String) sparseArray.get(209), edit);
                C002001d.A35("ab_props:db_migration_level_force", (String) sparseArray.get(242), edit);
                C002001d.A34("ab_props:db_migration_max_db_size", (String) sparseArray.get(261), edit);
                C002001d.A35("ab_props:db_migration_release_failure_login_controls", (String) sparseArray.get(262), edit);
                C002001d.A37("ab_props:db_verification_controls", "{\"config\": [{\"name\":\"all\", \"enabled\":false,\"run_sampling\":10000, \"old_data_sampling\":1000, \"new_data_sampling\":1000, \"critical_event_sampling\":0}]}", (String) sparseArray.get(277), edit);
                C002001d.A35("ab_props:shops_pdp_urls_config", (String) sparseArray.get(210), edit);
                C002001d.A36("ab_props:shops_storefront_native_entrypoint_enabled", (String) sparseArray.get(267), edit);
                C002001d.A36("ab_props:wallpapers_v2", (String) sparseArray.get(211), edit);
                C002001d.A34("ab_props:low_space_threshold", (String) sparseArray.get(224), edit);
                C002001d.A36("ab_props:video_transcode_retry_enabled", (String) sparseArray.get(227), edit);
                C002001d.A36("ab_props:video_transcode_fallback_enabled", (String) sparseArray.get(228), edit);
                C002001d.A36("ab_props:dedupe_transcode_images", (String) sparseArray.get(229), edit);
                C002001d.A36("ab_props:dedupe_transcode_videos", (String) sparseArray.get(230), edit);
                C002001d.A36("ab_props:dedupe_transcode_shared_images", (String) sparseArray.get(263), edit);
                C002001d.A36("ab_props:dedupe_transcode_shared_videos", (String) sparseArray.get(264), edit);
                C002001d.A36("ab_props:dedupe_transcode_gif", (String) sparseArray.get(231), edit);
                C002001d.A36("ab_props:dedupe_transcode_audio", (String) sparseArray.get(232), edit);
                C002001d.A36("ab_props:in_app_support_v2_enabled", (String) sparseArray.get(233), edit);
                C002001d.A36("ab_props:disable_new_sticker_animation", (String) sparseArray.get(234), edit);
                C002001d.A36("ab_props:enable_mmap_stringpacks", (String) sparseArray.get(235), edit);
                C002001d.A36("ab_props:new_sticker_animation_behavior_v2", (String) sparseArray.get(237), edit);
                C002001d.A36("ab_props:disable_privatestats_battery", (String) sparseArray.get(238), edit);
                C002001d.A36("ab_props:remove_geolocation_videos", (String) sparseArray.get(239), edit);
                C002001d.A36("ab_props:sticker_search_enabled", (String) sparseArray.get(240), edit);
                C002001d.A36("ab_props:enable_privatestats", (String) sparseArray.get(241), edit);
                C002001d.A36("ab_props:upload_status_thumb_mms_enabled", (String) sparseArray.get(246), edit);
                C002001d.A36("ab_props:upload_document_thumb_mms_enabled", (String) sparseArray.get(247), edit);
                C002001d.A36("ab_props:upload_link_thumb_mms_enabled", (String) sparseArray.get(248), edit);
                C002001d.A36("ab_props:download_status_thumb_mms_enabled", (String) sparseArray.get(249), edit);
                C002001d.A36("ab_props:download_document_thumb_mms_enabled", (String) sparseArray.get(250), edit);
                C002001d.A36("ab_props:download_link_thumb_mms_enabled", (String) sparseArray.get(251), edit);
                C002001d.A36("ab_props:send_status_thumb_in_message_disabled", (String) sparseArray.get(252), edit);
                C002001d.A36("ab_props:send_document_thumb_in_message_disabled", (String) sparseArray.get(253), edit);
                C002001d.A36("ab_props:send_link_thumb_in_message_disabled", (String) sparseArray.get(254), edit);
                C002001d.A36("ab_props:animated_stickers_thread_clean_up", (String) sparseArray.get(255), edit);
                C002001d.A36("ab_props:media_upload_aggressive_retry_enabled", (String) sparseArray.get(256), edit);
                C002001d.A36("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled", (String) sparseArray.get(257), edit);
                C002001d.A34("ab_props:media_upload_max_aggressive_retries", (String) sparseArray.get(258), edit);
                C002001d.A36("ab_props:pen_smoothing_enabled", (String) sparseArray.get(274), edit);
                C002001d.A36("ab_props:status_grid_enabled", (String) sparseArray.get(278), edit);
                C002001d.A36("ab_props:pencil_ui_enhancements_wave_1_enabled", (String) sparseArray.get(279), edit);
                C002001d.A36("ab_props:enable_catalogs_carts", (String) sparseArray.get(259), edit);
                C002001d.A35("ab_props:shops_storefront_urls_config", (String) sparseArray.get(265), edit);
                C002001d.A36("ab_props:app_locked_with_biometrics", (String) sparseArray.get(266), edit);
                C002001d.A36("ab_props:android_media_use_fresco_for_gifs", (String) sparseArray.get(270), edit);
                C002001d.A36("ab_props:sticker_tray_animation_finite_loops", (String) sparseArray.get(271), edit);
                C002001d.A36("ab_props:sticker_tray_animation_first_row", (String) sparseArray.get(272), edit);
                C002001d.A36("ab_props:sticker_tray_animation_fully_visible_items", (String) sparseArray.get(273), edit);
                C002001d.A36("ab_props:sticker_picker_animated_sticker_shrinking", (String) sparseArray.get(276), edit);
                C002001d.A36("ab_props:android_push_notify_fg_service", (String) sparseArray.get(280), edit);
                C002001d.A34("ab_props:group_chat_message_push_priority_obfuscation_percent", (String) sparseArray.get(282), edit);
                C002001d.A36("ab_props:android_push_config_muted_chats", (String) sparseArray.get(283), edit);
                C002001d.A36("ab_props:third_party_animated_sticker_import", (String) sparseArray.get(290), edit);
                C002001d.A36("ab_props:sticker_contextual_suggestion_enabled", (String) sparseArray.get(291), edit);
                C002001d.A36("ab_props:disable_third_party_animated_sticker_animation", (String) sparseArray.get(295), edit);
                C002001d.A36("ab_props:yt_video_preview", (String) sparseArray.get(314), edit);
                C002001d.A36("ab_props:android_us_language_selector", (String) sparseArray.get(292), edit);
                C002001d.A36("ab_props:stanza_processing_logging_enabled", (String) sparseArray.get(296), edit);
                C002001d.A34("ab_props:privatestats_upload_jitter_secs", (String) sparseArray.get(305), edit);
                C002001d.A36("ab_props:payments_bloks_rendercore_enabled", (String) sparseArray.get(307), edit);
                C002001d.A36("ab_props:groups_dogfooding_ui", (String) sparseArray.get(308), edit);
                C002001d.A36("ab_props:md_icdc_enabled", (String) sparseArray.get(309), edit);
                C002001d.A34("ab_props:md_icdc_hash_length", (String) sparseArray.get(310), edit);
                C002001d.A36("ab_props:disable_buttons_message", (String) sparseArray.get(316), edit);
                C002001d.A36("ab_props:mute_video", (String) sparseArray.get(325), edit);
                C002001d.A36("ab_props:new_user_location_dialogs_enabled", (String) sparseArray.get(332), edit);
                C002001d.A36("ab_props:use_compressed_packfile", (String) sparseArray.get(334), edit);
                C002001d.A36("ab_props:new_business_profile_info_view_enabled", (String) sparseArray.get(37), edit);
                C002001d.A36("ab_props:smb_profile_banner_new_copy_enabled", (String) sparseArray.get(158), edit);
                C002001d.A36("ab_props:smb_profile_banner_prioritized_enabled", (String) sparseArray.get(159), edit);
                C002001d.A34("ab_props:smb_banner_max_display_days", (String) sparseArray.get(163), edit);
                C002001d.A34("ab_props:smb_banner_max_click_count", (String) sparseArray.get(164), edit);
                C002001d.A34("ab_props:smb_banner_max_dismiss_count", (String) sparseArray.get(165), edit);
                C002001d.A34("ab_props:smb_banner_display_days_consec", (String) sparseArray.get(166), edit);
                C002001d.A34("ab_props:smb_days_between_banner", (String) sparseArray.get(167), edit);
                C002001d.A36("ab_props:edit_business_profile_new_mode_enabled", (String) sparseArray.get(297), edit);
                C002001d.A36("ab_props:smb_better_catalog_upload_enabled", (String) sparseArray.get(306), edit);
                C002001d.A36("ab_props:qpl_enabled", (String) sparseArray.get(212), edit);
                C002001d.A34("ab_props:qpl_max_file_size", (String) sparseArray.get(213), edit);
                C002001d.A34("ab_props:qpl_max_file_count", (String) sparseArray.get(214), edit);
                C002001d.A34("ab_props:qpl_upload_delay", (String) sparseArray.get(215), edit);
                C002001d.A34("ab_props:qpl_seed", (String) sparseArray.get(225), edit);
                C002001d.A37("ab_props:qpl_sampling", "{\"sampling\":[]}", (String) sparseArray.get(226), edit);
                C002001d.A36("ab_props:stop_abprops_traffic_in_serverprops_response", (String) sparseArray.get(315), edit);
                C002001d.A34("ab_props:abprops_beta_pull_frequency", (String) sparseArray.get(327), edit);
                edit.apply();
            }
            HashSet hashSet = new HashSet();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw null;
            }
            SharedPreferences.Editor edit2 = this.A01.edit();
            edit2.putStringSet("ab_offline_props:offline_exposure_strings", hashSet);
            edit2.apply();
            this.A00 = true;
        }
    }
}
