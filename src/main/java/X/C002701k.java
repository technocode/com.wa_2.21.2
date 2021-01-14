package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.01k  reason: invalid class name and case insensitive filesystem */
public class C002701k {
    public static final AnonymousClass03V A0V;
    public static volatile C002701k A0W;
    public final int A00 = 400;
    public final int A01 = 812;
    public final int A02 = 32;
    public final int A03 = 100;
    public final int A04 = 3;
    public final int A05 = -1;
    public final int A06 = 30;
    public final int A07 = 5;
    public final int A08 = 1024;
    public final int A09 = 1440;
    public final int A0A = 400;
    public final int A0B = 200;
    public final int A0C = 2;
    public final int A0D = 2;
    public final int A0E = 1;
    public final int A0F = 4;
    public final int A0G = 5;
    public final int A0H = 45;
    public final int A0I = 5000;
    public final int A0J = -1;
    public final SharedPreferences A0K;
    public final AnonymousClass038 A0L;
    public final String A0M = "none";
    public final String A0N = "all";
    public final String A0O = "none";
    public final String A0P = "none";
    public final String A0Q = "{\"config\": [{\"name\":\"all\", \"enabled\":false,\"run_sampling\":10000, \"old_data_sampling\":1000, \"new_data_sampling\":1000, \"critical_event_sampling\":0}]}";
    public final String A0R = "{\"sampling\":[]}";
    public final boolean A0S = true;
    public final boolean A0T = true;
    public final boolean A0U = true;

    static {
        List asList = Arrays.asList("disable_prewarm", "scroll_perf", "progressive_jpeg_thumbnail_enabled", "reusable_video_player_enabled", "buffer_for_playback", "watls_enabled", "watls_no_dns", "watls_prefer_ip6", "watls_early_data", "watls_enable_early_data_http_post", "watls_enable_early_data_http_get", "media_autodownload_thread_pool_size", "autodownload_priority_policy", "offline_text_color_change", "mms_tcp_congestion_bbr", "camelot", "roundtable", "room_messenger_upgrade", "whats_my_number_enabled", "sms_retriever_first", "offline_aa_test_config", "offline_aa_test_config_v2", "consumer_reg_profile_design", "status_fast_streaming_enable_test", "status_fast_streaming_initial_buffering_second_test", "status_fast_streaming_unstall_second_test", "status_fast_streaming_unstall_multiplier_test", "status_aggressive_prefetch_seconds", "image_max_edge_test", "status_image_max_edge_test", "image_compression_quality_test", "status_image_compression_quality_test", "image_quality_group", "stream_progressive_jpeg_enabled", "liger_enabled", "liger_quic_enabled", "mms4_pps_download_thumbnail", "mms4_pps_download_full_size", "pjeg_data_saver_enabled", "pjpeg_status_data_saver_enabled", "pjpeg_chat_data_saver_enabled", "download_full_pjpeg_max_edge", "download_full_pjpeg_max_edge_status", "higher_image_max_edge", "higher_image_max_edge_status", "image_max_kb_for_skipping_compression", "higher_image_quality", "higher_image_quality_status", "new_wam_runtime_enabled", "new_wam_runtime_beaconing", "status_collapse_muted", "photo_upload_bandwidth_estimation_enabled", "photo_download_bandwidth_estimation_enabled", "pjpeg_force_download_mid_quality_enabled", "dns_over_https_enabled", "dns_over_https_interleave_enabled", "camera_core_integration_enabled", "bandwidth_estimation_algorithm", "bandwidth_estimation_adjacent_hours_optimization", "lazy_camera_view_inflation", "sender_higher_quality_bandwidth_threshold", "receiver_higher_quality_bandwidth_threshold", "photo_download_realtime_bandwidth_enabled", "wamsys_registration_enabled", "wamsys_registration_value", "wamsys_registration_v3_enabled", "wamsys_registration_v4_enabled", "wamsys_registration_v5_enabled", "wamsys_registration_v6_enabled", "mms_chatd_resume_check_override", "disable_status_autodownload_inactive_users", "auto_expo_int_field", "auto_expo_status_tab_open", "wamsys_mms_enabled", "mms_media_conn_persist_enabled", "mms_media_conn_foreground_only_enabled", "android_camera2_support_level", "connect_with_friends_dialog_enabled", "max_keys", "video_max_bitrate", "work_manager_hourly_cron", "work_manager_ntp_sync", "media_max_autodownload_wifi_mb", "media_max_autodownload", "status_video_max_duration", "voip_fix_converter_memory_leak", "enable_non_wake_up_alarm_ping", "async_init_after_thread_idle", "wamsys_decryption_individual_enabled", "wamsys_encryption_individual_enabled", "wamsys_decryption_group_enabled", "wamsys_encryption_group_enabled", "android_test_scheduler_api", "android_test_scheduler_period_impl", "android_test_scheduler_period_hours", "android_test_scheduler_run_seconds", "transsion_badging", "enable_hash_based_hybrid_codecs_mask", "upload_thread_lower_priority", "async_data_load_on_startup", "enable_long_running_job_monitor", "bloks_use_minscript_android", "load_chats_lazily", "status_ranking", "db_migration_low_latency_kill_switch_latency", "db_migration_low_latency_kill_switch", "db_migration_low_latency_kill_switch_experiment", "db_migration_data_source_v1", "db_migration_data_source_v2", "db_migration_level_reset", "db_migration_level_keep", "db_migration_level_migrate", "db_migration_level_force", "db_migration_max_db_size", "db_migration_release_failure_login_controls", "db_verification_controls", "shops_pdp_urls_config", "shops_storefront_native_entrypoint_enabled", "wallpapers_v2", "low_space_threshold", "video_transcode_retry_enabled", "video_transcode_fallback_enabled", "dedupe_transcode_images", "dedupe_transcode_videos", "dedupe_transcode_shared_images", "dedupe_transcode_shared_videos", "dedupe_transcode_gif", "dedupe_transcode_audio", "in_app_support_v2_enabled", "disable_new_sticker_animation", "enable_mmap_stringpacks", "new_sticker_animation_behavior_v2", "disable_privatestats_battery", "remove_geolocation_videos", "sticker_search_enabled", "enable_privatestats", "upload_status_thumb_mms_enabled", "upload_document_thumb_mms_enabled", "upload_link_thumb_mms_enabled", "download_status_thumb_mms_enabled", "download_document_thumb_mms_enabled", "download_link_thumb_mms_enabled", "send_status_thumb_in_message_disabled", "send_document_thumb_in_message_disabled", "send_link_thumb_in_message_disabled", "animated_stickers_thread_clean_up", "media_upload_aggressive_retry_enabled", "media_upload_aggressive_retry_exponential_backoff_enabled", "media_upload_max_aggressive_retries", "pen_smoothing_enabled", "status_grid_enabled", "pencil_ui_enhancements_wave_1_enabled", "enable_catalogs_carts", "shops_storefront_urls_config", "app_locked_with_biometrics", "android_media_use_fresco_for_gifs", "sticker_tray_animation_finite_loops", "sticker_tray_animation_first_row", "sticker_tray_animation_fully_visible_items", "sticker_picker_animated_sticker_shrinking", "android_push_notify_fg_service", "group_chat_message_push_priority_obfuscation_percent", "android_push_config_muted_chats", "third_party_animated_sticker_import", "sticker_contextual_suggestion_enabled", "disable_third_party_animated_sticker_animation", "yt_video_preview", "android_us_language_selector", "stanza_processing_logging_enabled", "privatestats_upload_jitter_secs", "payments_bloks_rendercore_enabled", "groups_dogfooding_ui", "md_icdc_enabled", "md_icdc_hash_length", "disable_buttons_message", "mute_video", "new_user_location_dialogs_enabled", "use_compressed_packfile", "new_business_profile_info_view_enabled", "smb_profile_banner_new_copy_enabled", "smb_profile_banner_prioritized_enabled", "smb_banner_max_display_days", "smb_banner_max_click_count", "smb_banner_max_dismiss_count", "smb_banner_display_days_consec", "smb_days_between_banner", "edit_business_profile_new_mode_enabled", "smb_better_catalog_upload_enabled", "qpl_enabled", "qpl_max_file_size", "qpl_max_file_count", "qpl_upload_delay", "qpl_seed", "qpl_sampling", "stop_abprops_traffic_in_serverprops_response", "abprops_beta_pull_frequency");
        AnonymousClass03V r0 = new AnonymousClass03V(0);
        if (asList != null) {
            r0.addAll(asList);
        }
        A0V = r0;
    }

    public C002701k(AnonymousClass038 r4, AnonymousClass022 r5) {
        this.A0L = r4;
        this.A0K = r5.A02("ab-props");
    }

    public static C002701k A00() {
        if (A0W == null) {
            synchronized (C002701k.class) {
                if (A0W == null) {
                    AnonymousClass03X.A00();
                    A0W = new C002701k(AnonymousClass038.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A0W;
    }

    public static String A01(SparseArray sparseArray, int i) {
        Pair pair = (Pair) sparseArray.get(i);
        if (pair == null) {
            return null;
        }
        return (String) pair.second;
    }

    public static String A02(SparseArray sparseArray, int i) {
        Pair pair = (Pair) sparseArray.get(i);
        if (pair == null) {
            return null;
        }
        return (String) pair.first;
    }

    public synchronized int A03(int i) {
        if (i == 80) {
            A0D("ab_props:status_fast_streaming_initial_buffering_second_test_expo_key");
            return A04("ab_props:status_fast_streaming_initial_buffering_second_test", 1);
        } else if (i == 81) {
            A0D("ab_props:status_fast_streaming_unstall_second_test_expo_key");
            return A04("ab_props:status_fast_streaming_unstall_second_test", 1);
        } else if (i == 126) {
            A0D("ab_props:image_max_kb_for_skipping_compression_expo_key");
            return A04("ab_props:image_max_kb_for_skipping_compression", 400);
        } else if (i == 127) {
            A0D("ab_props:bandwidth_estimation_algorithm_expo_key");
            return A04("ab_props:bandwidth_estimation_algorithm", 0);
        } else if (i == 129) {
            A0D("ab_props:sender_higher_quality_bandwidth_threshold_expo_key");
            return A04("ab_props:sender_higher_quality_bandwidth_threshold", 200);
        } else if (i == 130) {
            A0D("ab_props:receiver_higher_quality_bandwidth_threshold_expo_key");
            return A04("ab_props:receiver_higher_quality_bandwidth_threshold", 400);
        } else if (i == 156) {
            A0D("ab_props:max_keys_expo_key");
            return A04("ab_props:max_keys", 812);
        } else if (i == 157) {
            A0D("ab_props:video_max_bitrate_expo_key");
            return A04("ab_props:video_max_bitrate", 5000);
        } else if (i == 185) {
            A0D("ab_props:android_test_scheduler_period_hours_expo_key");
            return A04("ab_props:android_test_scheduler_period_hours", 6);
        } else if (i == 186) {
            A0D("ab_props:android_test_scheduler_run_seconds_expo_key");
            return A04("ab_props:android_test_scheduler_run_seconds", 1);
        } else if (i == 191) {
            A0D("ab_props:enable_hash_based_hybrid_codecs_mask_expo_key");
            return A04("ab_props:enable_hash_based_hybrid_codecs_mask", 0);
        } else if (i != 192) {
            switch (i) {
                case 22:
                    A0D("ab_props:scroll_perf_expo_key");
                    return A04("ab_props:scroll_perf", 0);
                case 25:
                    A0D("ab_props:buffer_for_playback_expo_key");
                    return A04("ab_props:buffer_for_playback", 2500);
                case 49:
                    A0D("ab_props:media_autodownload_thread_pool_size_expo_key");
                    return A04("ab_props:media_autodownload_thread_pool_size", 1);
                case 60:
                    A0D("ab_props:autodownload_priority_policy_expo_key");
                    return A04("ab_props:autodownload_priority_policy", 0);
                case 119:
                    A0D("ab_props:new_wam_runtime_beaconing_expo_key");
                    return A04("ab_props:new_wam_runtime_beaconing", 100);
                case 134:
                    A0D("ab_props:wamsys_registration_value_expo_key");
                    return A04("ab_props:wamsys_registration_value", -1);
                case 136:
                    A0D("ab_props:mms_chatd_resume_check_override_expo_key");
                    return A04("ab_props:mms_chatd_resume_check_override", -1);
                case 142:
                    A0D("ab_props:auto_expo_int_field_expo_key");
                    return A04("ab_props:auto_expo_int_field", -1);
                case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*{ENCODED_INT: 144}*/:
                    A0D("ab_props:auto_expo_status_tab_open_expo_key");
                    return A04("ab_props:auto_expo_status_tab_open", -1);
                case 163:
                    A0D("ab_props:smb_banner_max_display_days_expo_key");
                    return A04("ab_props:smb_banner_max_display_days", 4);
                case 164:
                    A0D("ab_props:smb_banner_max_click_count_expo_key");
                    return A04("ab_props:smb_banner_max_click_count", 2);
                case 165:
                    A0D("ab_props:smb_banner_max_dismiss_count_expo_key");
                    return A04("ab_props:smb_banner_max_dismiss_count", 1);
                case 166:
                    A0D("ab_props:smb_banner_display_days_consec_expo_key");
                    return A04("ab_props:smb_banner_display_days_consec", 2);
                case 167:
                    A0D("ab_props:smb_days_between_banner_expo_key");
                    return A04("ab_props:smb_days_between_banner", 5);
                case 168:
                    A0D("ab_props:media_max_autodownload_wifi_mb_expo_key");
                    return A04("ab_props:media_max_autodownload_wifi_mb", 100);
                case 169:
                    A0D("ab_props:media_max_autodownload_expo_key");
                    return A04("ab_props:media_max_autodownload", 32);
                case 175:
                    A0D("ab_props:status_video_max_duration_expo_key");
                    return A04("ab_props:status_video_max_duration", 45);
                case 200:
                    A0D("ab_props:db_migration_low_latency_kill_switch_latency_expo_key");
                    return A04("ab_props:db_migration_low_latency_kill_switch_latency", 0);
                case 224:
                    A0D("ab_props:low_space_threshold_expo_key");
                    return A04("ab_props:low_space_threshold", 50);
                case 225:
                    A0D("ab_props:qpl_seed_expo_key");
                    return A04("ab_props:qpl_seed", 0);
                case 258:
                    A0D("ab_props:media_upload_max_aggressive_retries_expo_key");
                    return A04("ab_props:media_upload_max_aggressive_retries", 3);
                case 261:
                    A0D("ab_props:db_migration_max_db_size_expo_key");
                    return A04("ab_props:db_migration_max_db_size", 0);
                case 282:
                    A0D("ab_props:group_chat_message_push_priority_obfuscation_percent_expo_key");
                    return A04("ab_props:group_chat_message_push_priority_obfuscation_percent", 0);
                case 305:
                    A0D("ab_props:privatestats_upload_jitter_secs_expo_key");
                    return A04("ab_props:privatestats_upload_jitter_secs", 30);
                case 310:
                    A0D("ab_props:md_icdc_hash_length_expo_key");
                    return A04("ab_props:md_icdc_hash_length", 10);
                case 327:
                    A0D("ab_props:abprops_beta_pull_frequency_expo_key");
                    return A04("ab_props:abprops_beta_pull_frequency", 86400);
                default:
                    switch (i) {
                        case 86:
                            A0D("ab_props:image_max_edge_test_expo_key");
                            return A04("ab_props:image_max_edge_test", 0);
                        case 87:
                            A0D("ab_props:status_image_max_edge_test_expo_key");
                            return A04("ab_props:status_image_max_edge_test", 0);
                        case 88:
                            A0D("ab_props:image_compression_quality_test_expo_key");
                            return A04("ab_props:image_compression_quality_test", 0);
                        case 89:
                            A0D("ab_props:status_image_compression_quality_test_expo_key");
                            return A04("ab_props:status_image_compression_quality_test", 0);
                        case 90:
                            A0D("ab_props:image_quality_group_expo_key");
                            return A04("ab_props:image_quality_group", 0);
                        default:
                            switch (i) {
                                case 112:
                                    A0D("ab_props:download_full_pjpeg_max_edge_expo_key");
                                    return A04("ab_props:download_full_pjpeg_max_edge", 0);
                                case 113:
                                    A0D("ab_props:download_full_pjpeg_max_edge_status_expo_key");
                                    return A04("ab_props:download_full_pjpeg_max_edge_status", 0);
                                case 114:
                                    A0D("ab_props:higher_image_max_edge_expo_key");
                                    return A04("ab_props:higher_image_max_edge", 0);
                                case 115:
                                    A0D("ab_props:higher_image_max_edge_status_expo_key");
                                    return A04("ab_props:higher_image_max_edge_status", 0);
                                case 116:
                                    A0D("ab_props:higher_image_quality_expo_key");
                                    return A04("ab_props:higher_image_quality", 0);
                                case 117:
                                    A0D("ab_props:higher_image_quality_status_expo_key");
                                    return A04("ab_props:higher_image_quality_status", 0);
                                default:
                                    switch (i) {
                                        case 213:
                                            A0D("ab_props:qpl_max_file_size_expo_key");
                                            return A04("ab_props:qpl_max_file_size", 1024);
                                        case 214:
                                            A0D("ab_props:qpl_max_file_count_expo_key");
                                            return A04("ab_props:qpl_max_file_count", 5);
                                        case 215:
                                            A0D("ab_props:qpl_upload_delay_expo_key");
                                            return A04("ab_props:qpl_upload_delay", 1440);
                                        default:
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("unrecognized field with code ");
                                            sb.append(i);
                                            throw new IllegalArgumentException(sb.toString());
                                    }
                            }
                    }
            }
        } else {
            A0D("ab_props:upload_thread_lower_priority_expo_key");
            return A04("ab_props:upload_thread_lower_priority", 0);
        }
    }

    public final int A04(String str, int i) {
        if (A0G(str) && C007603r.A08()) {
            str = AnonymousClass008.A0K("prop_override:", str);
        }
        return this.A0K.getInt(str, i);
    }

    public synchronized long A05() {
        return this.A0K.getLong("ab_props:sys:last_refresh_time", 0);
    }

    public synchronized String A06(int i) {
        if (i == 151) {
            A0D("ab_props:android_camera2_support_level_expo_key");
            return A07("ab_props:android_camera2_support_level", "");
        } else if (i == 203) {
            A0D("ab_props:db_migration_low_latency_kill_switch_experiment_expo_key");
            return A07("ab_props:db_migration_low_latency_kill_switch_experiment", "");
        } else if (i == 242) {
            A0D("ab_props:db_migration_level_force_expo_key");
            return A07("ab_props:db_migration_level_force", "none");
        } else if (i == 262) {
            A0D("ab_props:db_migration_release_failure_login_controls_expo_key");
            return A07("ab_props:db_migration_release_failure_login_controls", "");
        } else if (i == 265) {
            A0D("ab_props:shops_storefront_urls_config_expo_key");
            return A07("ab_props:shops_storefront_urls_config", "");
        } else if (i == 183) {
            A0D("ab_props:android_test_scheduler_api_expo_key");
            return A07("ab_props:android_test_scheduler_api", "none");
        } else if (i != 184) {
            switch (i) {
                case 205:
                    A0D("ab_props:db_migration_data_source_v1_expo_key");
                    return A07("ab_props:db_migration_data_source_v1", "all");
                case 206:
                    A0D("ab_props:db_migration_data_source_v2_expo_key");
                    return A07("ab_props:db_migration_data_source_v2", "none");
                case 207:
                    A0D("ab_props:db_migration_level_reset_expo_key");
                    return A07("ab_props:db_migration_level_reset", "none");
                case 208:
                    A0D("ab_props:db_migration_level_keep_expo_key");
                    return A07("ab_props:db_migration_level_keep", "all");
                case 209:
                    A0D("ab_props:db_migration_level_migrate_expo_key");
                    return A07("ab_props:db_migration_level_migrate", "none");
                case 210:
                    A0D("ab_props:shops_pdp_urls_config_expo_key");
                    return A07("ab_props:shops_pdp_urls_config", "");
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unrecognized field with code ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            A0D("ab_props:android_test_scheduler_period_impl_expo_key");
            return A07("ab_props:android_test_scheduler_period_impl", "none");
        }
    }

    public final String A07(String str, String str2) {
        if (A0G(str) && C007603r.A08()) {
            str = AnonymousClass008.A0K("prop_override:", str);
        }
        return this.A0K.getString(str, str2);
    }

    public synchronized JSONObject A08(int i) {
        if (i == 226) {
            A0D("ab_props:qpl_sampling_expo_key");
            return A09("ab_props:qpl_sampling", "{\"sampling\":[]}");
        } else if (i == 277) {
            A0D("ab_props:db_verification_controls_expo_key");
            return A09("ab_props:db_verification_controls", "{\"config\": [{\"name\":\"all\", \"enabled\":false,\"run_sampling\":10000, \"old_data_sampling\":1000, \"new_data_sampling\":1000, \"critical_event_sampling\":0}]}");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unrecognized field with code ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final JSONObject A09(String str, String str2) {
        if (A0G(str) && C007603r.A08()) {
            str = AnonymousClass008.A0K("prop_override:", str);
        }
        SharedPreferences sharedPreferences = this.A0K;
        String string = sharedPreferences.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            str2 = string;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PropsCommon/invalid json format for property from file; prefKey=");
            sb.append(str);
            sb.append("; value=");
            sb.append(str2);
            Log.w(sb.toString(), e);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str);
            edit.apply();
            throw new IllegalArgumentException(AnonymousClass008.A0M("PropsCommon/invalid json format for property; prefKey=", str, "; value=", str2), e);
        }
    }

    public synchronized void A0A(int i) {
        SharedPreferences.Editor edit = this.A0K.edit();
        edit.putInt("ab_props:sys:fetch_attemp_count", i);
        edit.apply();
    }

    public synchronized void A0B(int i) {
        SharedPreferences.Editor edit = this.A0K.edit();
        edit.putInt("ab_props:sys:last_error_code", i);
        edit.apply();
    }

    public final synchronized void A0C(SharedPreferences.Editor editor, AnonymousClass03V r6) {
        editor.putStringSet("ab_props:sys:last_exposure_keys", r6);
        editor.apply();
        AnonymousClass038 r3 = this.A0L;
        String join = TextUtils.join(",", r6);
        r3.A03(5029, join, 0);
        r3.A03(5029, join, 1);
    }

    public final void A0D(String str) {
        AnonymousClass03V r1;
        SharedPreferences sharedPreferences = this.A0K;
        String string = sharedPreferences.getString(str, null);
        Collection stringSet = sharedPreferences.getStringSet("ab_props:sys:last_exposure_keys", null);
        if (stringSet == null) {
            r1 = new AnonymousClass03V(0);
        } else {
            r1 = new AnonymousClass03V(0);
            r1.addAll(stringSet);
        }
        if (!TextUtils.isEmpty(string) && !r1.contains(string)) {
            r1.add(string);
            synchronized (this) {
                A0C(sharedPreferences.edit(), r1);
            }
        }
    }

    public synchronized boolean A0E(int i) {
        if (i == 58) {
            A0D("ab_props:watls_no_dns_expo_key");
            return A0H("ab_props:watls_no_dns", false);
        } else if (i == 59) {
            A0D("ab_props:watls_prefer_ip6_expo_key");
            return A0H("ab_props:watls_prefer_ip6", false);
        } else if (i == 71) {
            A0D("ab_props:offline_text_color_change_expo_key");
            return A0H("ab_props:offline_text_color_change", false);
        } else if (i == 72) {
            A0D("ab_props:mms_tcp_congestion_bbr_expo_key");
            return A0H("ab_props:mms_tcp_congestion_bbr", false);
        } else if (i == 109) {
            A0D("ab_props:pjpeg_status_data_saver_enabled_expo_key");
            return A0H("ab_props:pjpeg_status_data_saver_enabled", false);
        } else if (i == 110) {
            A0D("ab_props:pjpeg_chat_data_saver_enabled_expo_key");
            return A0H("ab_props:pjpeg_chat_data_saver_enabled", false);
        } else if (i == 158) {
            A0D("ab_props:smb_profile_banner_new_copy_enabled_expo_key");
            return A0H("ab_props:smb_profile_banner_new_copy_enabled", false);
        } else if (i != 159) {
            switch (i) {
                case 15:
                    A0D("ab_props:disable_prewarm_expo_key");
                    return A0H("ab_props:disable_prewarm", false);
                case 24:
                    A0D("ab_props:progressive_jpeg_thumbnail_enabled_expo_key");
                    return A0H("ab_props:progressive_jpeg_thumbnail_enabled", false);
                case 37:
                    A0D("ab_props:new_business_profile_info_view_enabled_expo_key");
                    return A0H("ab_props:new_business_profile_info_view_enabled", false);
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                    A0D("ab_props:reusable_video_player_enabled_expo_key");
                    return A0H("ab_props:reusable_video_player_enabled", false);
                case 48:
                    A0D("ab_props:watls_enabled_expo_key");
                    return A0H("ab_props:watls_enabled", false);
                case 56:
                    A0D("ab_props:status_ranking_expo_key");
                    return A0H("ab_props:status_ranking", false);
                case 65:
                    A0D("ab_props:watls_early_data_expo_key");
                    return A0H("ab_props:watls_early_data", false);
                case 75:
                    A0D("ab_props:whats_my_number_enabled_expo_key");
                    return A0H("ab_props:whats_my_number_enabled", false);
                case 77:
                    A0D("ab_props:consumer_reg_profile_design_expo_key");
                    return A0H("ab_props:consumer_reg_profile_design", false);
                case 79:
                    A0D("ab_props:status_fast_streaming_enable_test_expo_key");
                    return A0H("ab_props:status_fast_streaming_enable_test", false);
                case 91:
                    A0D("ab_props:sms_retriever_first_expo_key");
                    return A0H("ab_props:sms_retriever_first", false);
                case 118:
                    A0D("ab_props:new_wam_runtime_enabled_expo_key");
                    return A0H("ab_props:new_wam_runtime_enabled", true);
                case 128:
                    A0D("ab_props:lazy_camera_view_inflation_expo_key");
                    return A0H("ab_props:lazy_camera_view_inflation", true);
                case 138:
                    A0D("ab_props:disable_status_autodownload_inactive_users_expo_key");
                    return A0H("ab_props:disable_status_autodownload_inactive_users", false);
                case 140:
                    A0D("ab_props:wamsys_registration_v3_enabled_expo_key");
                    return A0H("ab_props:wamsys_registration_v3_enabled", false);
                case 143:
                    A0D("ab_props:wamsys_registration_v4_enabled_expo_key");
                    return A0H("ab_props:wamsys_registration_v4_enabled", false);
                case 145:
                    A0D("ab_props:wamsys_registration_v5_enabled_expo_key");
                    return A0H("ab_props:wamsys_registration_v5_enabled", false);
                case 152:
                    A0D("ab_props:connect_with_friends_dialog_enabled_expo_key");
                    return A0H("ab_props:connect_with_friends_dialog_enabled", false);
                case 154:
                    A0D("ab_props:bandwidth_estimation_adjacent_hours_optimization_expo_key");
                    return A0H("ab_props:bandwidth_estimation_adjacent_hours_optimization", true);
                case 161:
                    A0D("ab_props:work_manager_hourly_cron_expo_key");
                    return A0H("ab_props:work_manager_hourly_cron", false);
                case 170:
                    A0D("ab_props:work_manager_ntp_sync_expo_key");
                    return A0H("ab_props:work_manager_ntp_sync", false);
                case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*{ENCODED_INT: 176}*/:
                    A0D("ab_props:voip_fix_converter_memory_leak_expo_key");
                    return A0H("ab_props:voip_fix_converter_memory_leak", false);
                case 177:
                    A0D("ab_props:camelot_expo_key");
                    return A0H("ab_props:camelot", false);
                case 178:
                    A0D("ab_props:roundtable_expo_key");
                    return A0H("ab_props:roundtable", false);
                case 179:
                    A0D("ab_props:room_messenger_upgrade_expo_key");
                    return A0H("ab_props:room_messenger_upgrade", false);
                case 180:
                    A0D("ab_props:enable_non_wake_up_alarm_ping_expo_key");
                    return A0H("ab_props:enable_non_wake_up_alarm_ping", true);
                case 181:
                    A0D("ab_props:async_init_after_thread_idle_expo_key");
                    return A0H("ab_props:async_init_after_thread_idle", true);
                case 182:
                    A0D("ab_props:wamsys_decryption_individual_enabled_expo_key");
                    return A0H("ab_props:wamsys_decryption_individual_enabled", false);
                case 187:
                    A0D("ab_props:wamsys_encryption_individual_enabled_expo_key");
                    return A0H("ab_props:wamsys_encryption_individual_enabled", false);
                case 188:
                    A0D("ab_props:wamsys_decryption_group_enabled_expo_key");
                    return A0H("ab_props:wamsys_decryption_group_enabled", false);
                case 189:
                    A0D("ab_props:wamsys_encryption_group_enabled_expo_key");
                    return A0H("ab_props:wamsys_encryption_group_enabled", false);
                case 190:
                    A0D("ab_props:transsion_badging_expo_key");
                    return A0H("ab_props:transsion_badging", false);
                case 196:
                    A0D("ab_props:async_data_load_on_startup_expo_key");
                    return A0H("ab_props:async_data_load_on_startup", false);
                case 198:
                    A0D("ab_props:bloks_use_minscript_android_expo_key");
                    return A0H("ab_props:bloks_use_minscript_android", true);
                case 199:
                    A0D("ab_props:load_chats_lazily_expo_key");
                    return A0H("ab_props:load_chats_lazily", false);
                case 201:
                    A0D("ab_props:db_migration_low_latency_kill_switch_expo_key");
                    return A0H("ab_props:db_migration_low_latency_kill_switch", false);
                case 211:
                    A0D("ab_props:wallpapers_v2_expo_key");
                    return A0H("ab_props:wallpapers_v2", false);
                case 212:
                    A0D("ab_props:qpl_enabled_expo_key");
                    return A0H("ab_props:qpl_enabled", false);
                case 227:
                    A0D("ab_props:video_transcode_retry_enabled_expo_key");
                    return A0H("ab_props:video_transcode_retry_enabled", false);
                case 228:
                    A0D("ab_props:video_transcode_fallback_enabled_expo_key");
                    return A0H("ab_props:video_transcode_fallback_enabled", false);
                case 229:
                    A0D("ab_props:dedupe_transcode_images_expo_key");
                    return A0H("ab_props:dedupe_transcode_images", false);
                case 230:
                    A0D("ab_props:dedupe_transcode_videos_expo_key");
                    return A0H("ab_props:dedupe_transcode_videos", false);
                case 231:
                    A0D("ab_props:dedupe_transcode_gif_expo_key");
                    return A0H("ab_props:dedupe_transcode_gif", false);
                case 232:
                    A0D("ab_props:dedupe_transcode_audio_expo_key");
                    return A0H("ab_props:dedupe_transcode_audio", false);
                case 233:
                    A0D("ab_props:in_app_support_v2_enabled_expo_key");
                    return A0H("ab_props:in_app_support_v2_enabled", false);
                case 234:
                    A0D("ab_props:disable_new_sticker_animation_expo_key");
                    return A0H("ab_props:disable_new_sticker_animation", false);
                case 235:
                    A0D("ab_props:enable_mmap_stringpacks_expo_key");
                    return A0H("ab_props:enable_mmap_stringpacks", false);
                case 237:
                    A0D("ab_props:new_sticker_animation_behavior_v2_expo_key");
                    return A0H("ab_props:new_sticker_animation_behavior_v2", false);
                case 238:
                    A0D("ab_props:disable_privatestats_battery_expo_key");
                    return A0H("ab_props:disable_privatestats_battery", false);
                case 239:
                    A0D("ab_props:remove_geolocation_videos_expo_key");
                    return A0H("ab_props:remove_geolocation_videos", false);
                case 240:
                    A0D("ab_props:sticker_search_enabled_expo_key");
                    return A0H("ab_props:sticker_search_enabled", false);
                case 241:
                    A0D("ab_props:enable_privatestats_expo_key");
                    return A0H("ab_props:enable_privatestats", false);
                case 246:
                    A0D("ab_props:upload_status_thumb_mms_enabled_expo_key");
                    return A0H("ab_props:upload_status_thumb_mms_enabled", false);
                case 247:
                    A0D("ab_props:upload_document_thumb_mms_enabled_expo_key");
                    return A0H("ab_props:upload_document_thumb_mms_enabled", false);
                case 248:
                    A0D("ab_props:upload_link_thumb_mms_enabled_expo_key");
                    return A0H("ab_props:upload_link_thumb_mms_enabled", false);
                case 249:
                    A0D("ab_props:download_status_thumb_mms_enabled_expo_key");
                    return A0H("ab_props:download_status_thumb_mms_enabled", false);
                case 250:
                    A0D("ab_props:download_document_thumb_mms_enabled_expo_key");
                    return A0H("ab_props:download_document_thumb_mms_enabled", false);
                case 251:
                    A0D("ab_props:download_link_thumb_mms_enabled_expo_key");
                    return A0H("ab_props:download_link_thumb_mms_enabled", false);
                case 252:
                    A0D("ab_props:send_status_thumb_in_message_disabled_expo_key");
                    return A0H("ab_props:send_status_thumb_in_message_disabled", false);
                case 253:
                    A0D("ab_props:send_document_thumb_in_message_disabled_expo_key");
                    return A0H("ab_props:send_document_thumb_in_message_disabled", false);
                case 254:
                    A0D("ab_props:send_link_thumb_in_message_disabled_expo_key");
                    return A0H("ab_props:send_link_thumb_in_message_disabled", false);
                case 255:
                    A0D("ab_props:animated_stickers_thread_clean_up_expo_key");
                    return A0H("ab_props:animated_stickers_thread_clean_up", false);
                case 256:
                    A0D("ab_props:media_upload_aggressive_retry_enabled_expo_key");
                    return A0H("ab_props:media_upload_aggressive_retry_enabled", false);
                case 257:
                    A0D("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled_expo_key");
                    return A0H("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled", false);
                case 259:
                    A0D("ab_props:enable_catalogs_carts_expo_key");
                    return A0H("ab_props:enable_catalogs_carts", false);
                case 263:
                    A0D("ab_props:dedupe_transcode_shared_images_expo_key");
                    return A0H("ab_props:dedupe_transcode_shared_images", false);
                case 264:
                    A0D("ab_props:dedupe_transcode_shared_videos_expo_key");
                    return A0H("ab_props:dedupe_transcode_shared_videos", false);
                case 266:
                    A0D("ab_props:app_locked_with_biometrics_expo_key");
                    return A0H("ab_props:app_locked_with_biometrics", false);
                case 267:
                    A0D("ab_props:shops_storefront_native_entrypoint_enabled_expo_key");
                    return A0H("ab_props:shops_storefront_native_entrypoint_enabled", false);
                case 270:
                    A0D("ab_props:android_media_use_fresco_for_gifs_expo_key");
                    return A0H("ab_props:android_media_use_fresco_for_gifs", false);
                case 271:
                    A0D("ab_props:sticker_tray_animation_finite_loops_expo_key");
                    return A0H("ab_props:sticker_tray_animation_finite_loops", false);
                case 272:
                    A0D("ab_props:sticker_tray_animation_first_row_expo_key");
                    return A0H("ab_props:sticker_tray_animation_first_row", false);
                case 273:
                    A0D("ab_props:sticker_tray_animation_fully_visible_items_expo_key");
                    return A0H("ab_props:sticker_tray_animation_fully_visible_items", false);
                case 274:
                    A0D("ab_props:pen_smoothing_enabled_expo_key");
                    return A0H("ab_props:pen_smoothing_enabled", false);
                case 276:
                    A0D("ab_props:sticker_picker_animated_sticker_shrinking_expo_key");
                    return A0H("ab_props:sticker_picker_animated_sticker_shrinking", false);
                case 278:
                    A0D("ab_props:status_grid_enabled_expo_key");
                    return A0H("ab_props:status_grid_enabled", false);
                case 279:
                    A0D("ab_props:pencil_ui_enhancements_wave_1_enabled_expo_key");
                    return A0H("ab_props:pencil_ui_enhancements_wave_1_enabled", false);
                case 280:
                    A0D("ab_props:android_push_notify_fg_service_expo_key");
                    return A0H("ab_props:android_push_notify_fg_service", false);
                case 281:
                    A0D("ab_props:enable_long_running_job_monitor_expo_key");
                    return A0H("ab_props:enable_long_running_job_monitor", false);
                case 283:
                    A0D("ab_props:android_push_config_muted_chats_expo_key");
                    return A0H("ab_props:android_push_config_muted_chats", false);
                case 290:
                    A0D("ab_props:third_party_animated_sticker_import_expo_key");
                    return A0H("ab_props:third_party_animated_sticker_import", false);
                case 291:
                    A0D("ab_props:sticker_contextual_suggestion_enabled_expo_key");
                    return A0H("ab_props:sticker_contextual_suggestion_enabled", false);
                case 292:
                    A0D("ab_props:android_us_language_selector_expo_key");
                    return A0H("ab_props:android_us_language_selector", true);
                case 295:
                    A0D("ab_props:disable_third_party_animated_sticker_animation_expo_key");
                    return A0H("ab_props:disable_third_party_animated_sticker_animation", false);
                case 296:
                    A0D("ab_props:stanza_processing_logging_enabled_expo_key");
                    return A0H("ab_props:stanza_processing_logging_enabled", true);
                case 297:
                    A0D("ab_props:edit_business_profile_new_mode_enabled_expo_key");
                    return A0H("ab_props:edit_business_profile_new_mode_enabled", false);
                case 306:
                    A0D("ab_props:smb_better_catalog_upload_enabled_expo_key");
                    return A0H("ab_props:smb_better_catalog_upload_enabled", false);
                case 307:
                    A0D("ab_props:payments_bloks_rendercore_enabled_expo_key");
                    return A0H("ab_props:payments_bloks_rendercore_enabled", false);
                case 308:
                    A0D("ab_props:groups_dogfooding_ui_expo_key");
                    return A0H("ab_props:groups_dogfooding_ui", false);
                case 309:
                    A0D("ab_props:md_icdc_enabled_expo_key");
                    return A0H("ab_props:md_icdc_enabled", false);
                case 311:
                    A0D("ab_props:watls_enable_early_data_http_post_expo_key");
                    return A0H("ab_props:watls_enable_early_data_http_post", false);
                case 312:
                    A0D("ab_props:watls_enable_early_data_http_get_expo_key");
                    return A0H("ab_props:watls_enable_early_data_http_get", false);
                case 314:
                    A0D("ab_props:yt_video_preview_expo_key");
                    return A0H("ab_props:yt_video_preview", true);
                case 315:
                    A0D("ab_props:stop_abprops_traffic_in_serverprops_response_expo_key");
                    return A0H("ab_props:stop_abprops_traffic_in_serverprops_response", false);
                case 316:
                    A0D("ab_props:disable_buttons_message_expo_key");
                    return A0H("ab_props:disable_buttons_message", false);
                case 325:
                    A0D("ab_props:mute_video_expo_key");
                    return A0H("ab_props:mute_video", false);
                case 332:
                    A0D("ab_props:new_user_location_dialogs_enabled_expo_key");
                    return A0H("ab_props:new_user_location_dialogs_enabled", false);
                case 334:
                    A0D("ab_props:use_compressed_packfile_expo_key");
                    return A0H("ab_props:use_compressed_packfile", false);
                default:
                    switch (i) {
                        case 95:
                            A0D("ab_props:offline_aa_test_config_expo_key");
                            return A0H("ab_props:offline_aa_test_config", false);
                        case 96:
                            A0D("ab_props:offline_aa_test_config_v2_expo_key");
                            return A0H("ab_props:offline_aa_test_config_v2", false);
                        case 97:
                            A0D("ab_props:stream_progressive_jpeg_enabled_expo_key");
                            return A0H("ab_props:stream_progressive_jpeg_enabled", false);
                        case 98:
                            A0D("ab_props:liger_enabled_expo_key");
                            return A0H("ab_props:liger_enabled", false);
                        case 99:
                            A0D("ab_props:liger_quic_enabled_expo_key");
                            return A0H("ab_props:liger_quic_enabled", false);
                        default:
                            switch (i) {
                                case 101:
                                    A0D("ab_props:mms4_pps_download_thumbnail_expo_key");
                                    return A0H("ab_props:mms4_pps_download_thumbnail", false);
                                case 102:
                                    A0D("ab_props:mms4_pps_download_full_size_expo_key");
                                    return A0H("ab_props:mms4_pps_download_full_size", false);
                                case 103:
                                    A0D("ab_props:pjeg_data_saver_enabled_expo_key");
                                    return A0H("ab_props:pjeg_data_saver_enabled", false);
                                default:
                                    switch (i) {
                                        case 120:
                                            A0D("ab_props:status_collapse_muted_expo_key");
                                            return A0H("ab_props:status_collapse_muted", false);
                                        case 121:
                                            A0D("ab_props:photo_upload_bandwidth_estimation_enabled_expo_key");
                                            return A0H("ab_props:photo_upload_bandwidth_estimation_enabled", false);
                                        case 122:
                                            A0D("ab_props:photo_download_bandwidth_estimation_enabled_expo_key");
                                            return A0H("ab_props:photo_download_bandwidth_estimation_enabled", false);
                                        case 123:
                                            A0D("ab_props:pjpeg_force_download_mid_quality_enabled_expo_key");
                                            return A0H("ab_props:pjpeg_force_download_mid_quality_enabled", false);
                                        case 124:
                                            A0D("ab_props:dns_over_https_enabled_expo_key");
                                            return A0H("ab_props:dns_over_https_enabled", false);
                                        case 125:
                                            A0D("ab_props:camera_core_integration_enabled_expo_key");
                                            return A0H("ab_props:camera_core_integration_enabled", false);
                                        default:
                                            switch (i) {
                                                case 131:
                                                    A0D("ab_props:photo_download_realtime_bandwidth_enabled_expo_key");
                                                    return A0H("ab_props:photo_download_realtime_bandwidth_enabled", false);
                                                case 132:
                                                    A0D("ab_props:wamsys_registration_enabled_expo_key");
                                                    return A0H("ab_props:wamsys_registration_enabled", false);
                                                case 133:
                                                    A0D("ab_props:dns_over_https_interleave_enabled_expo_key");
                                                    return A0H("ab_props:dns_over_https_interleave_enabled", false);
                                                default:
                                                    switch (i) {
                                                        case 147:
                                                            A0D("ab_props:wamsys_mms_enabled_expo_key");
                                                            return A0H("ab_props:wamsys_mms_enabled", false);
                                                        case 148:
                                                            A0D("ab_props:wamsys_registration_v6_enabled_expo_key");
                                                            return A0H("ab_props:wamsys_registration_v6_enabled", false);
                                                        case 149:
                                                            A0D("ab_props:mms_media_conn_persist_enabled_expo_key");
                                                            return A0H("ab_props:mms_media_conn_persist_enabled", false);
                                                        case 150:
                                                            A0D("ab_props:mms_media_conn_foreground_only_enabled_expo_key");
                                                            return A0H("ab_props:mms_media_conn_foreground_only_enabled", false);
                                                        default:
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("unrecognized field with code ");
                                                            sb.append(i);
                                                            throw new IllegalArgumentException(sb.toString());
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            A0D("ab_props:smb_profile_banner_prioritized_enabled_expo_key");
            return A0H("ab_props:smb_profile_banner_prioritized_enabled", true);
        }
    }

    public synchronized boolean A0F(int i) {
        if (i == 58) {
            return this.A0K.contains("ab_props:watls_no_dns");
        } else if (i == 59) {
            return this.A0K.contains("ab_props:watls_prefer_ip6");
        } else if (i == 71) {
            return this.A0K.contains("ab_props:offline_text_color_change");
        } else if (i == 72) {
            return this.A0K.contains("ab_props:mms_tcp_congestion_bbr");
        } else if (i == 109) {
            return this.A0K.contains("ab_props:pjpeg_status_data_saver_enabled");
        } else if (i == 110) {
            return this.A0K.contains("ab_props:pjpeg_chat_data_saver_enabled");
        } else if (i == 158) {
            return this.A0K.contains("ab_props:smb_profile_banner_new_copy_enabled");
        } else if (i != 159) {
            switch (i) {
                case 15:
                    return this.A0K.contains("ab_props:disable_prewarm");
                case 24:
                    return this.A0K.contains("ab_props:progressive_jpeg_thumbnail_enabled");
                case 37:
                    return this.A0K.contains("ab_props:new_business_profile_info_view_enabled");
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                    return this.A0K.contains("ab_props:reusable_video_player_enabled");
                case 48:
                    return this.A0K.contains("ab_props:watls_enabled");
                case 56:
                    return this.A0K.contains("ab_props:status_ranking");
                case 65:
                    return this.A0K.contains("ab_props:watls_early_data");
                case 75:
                    return this.A0K.contains("ab_props:whats_my_number_enabled");
                case 77:
                    return this.A0K.contains("ab_props:consumer_reg_profile_design");
                case 79:
                    return this.A0K.contains("ab_props:status_fast_streaming_enable_test");
                case 91:
                    return this.A0K.contains("ab_props:sms_retriever_first");
                case 118:
                    return this.A0K.contains("ab_props:new_wam_runtime_enabled");
                case 128:
                    return this.A0K.contains("ab_props:lazy_camera_view_inflation");
                case 138:
                    return this.A0K.contains("ab_props:disable_status_autodownload_inactive_users");
                case 140:
                    return this.A0K.contains("ab_props:wamsys_registration_v3_enabled");
                case 143:
                    return this.A0K.contains("ab_props:wamsys_registration_v4_enabled");
                case 145:
                    return this.A0K.contains("ab_props:wamsys_registration_v5_enabled");
                case 152:
                    return this.A0K.contains("ab_props:connect_with_friends_dialog_enabled");
                case 154:
                    return this.A0K.contains("ab_props:bandwidth_estimation_adjacent_hours_optimization");
                case 161:
                    return this.A0K.contains("ab_props:work_manager_hourly_cron");
                case 170:
                    return this.A0K.contains("ab_props:work_manager_ntp_sync");
                case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*{ENCODED_INT: 176}*/:
                    return this.A0K.contains("ab_props:voip_fix_converter_memory_leak");
                case 177:
                    return this.A0K.contains("ab_props:camelot");
                case 178:
                    return this.A0K.contains("ab_props:roundtable");
                case 179:
                    return this.A0K.contains("ab_props:room_messenger_upgrade");
                case 180:
                    return this.A0K.contains("ab_props:enable_non_wake_up_alarm_ping");
                case 181:
                    return this.A0K.contains("ab_props:async_init_after_thread_idle");
                case 182:
                    return this.A0K.contains("ab_props:wamsys_decryption_individual_enabled");
                case 187:
                    return this.A0K.contains("ab_props:wamsys_encryption_individual_enabled");
                case 188:
                    return this.A0K.contains("ab_props:wamsys_decryption_group_enabled");
                case 189:
                    return this.A0K.contains("ab_props:wamsys_encryption_group_enabled");
                case 190:
                    return this.A0K.contains("ab_props:transsion_badging");
                case 196:
                    return this.A0K.contains("ab_props:async_data_load_on_startup");
                case 198:
                    return this.A0K.contains("ab_props:bloks_use_minscript_android");
                case 199:
                    return this.A0K.contains("ab_props:load_chats_lazily");
                case 201:
                    return this.A0K.contains("ab_props:db_migration_low_latency_kill_switch");
                case 211:
                    return this.A0K.contains("ab_props:wallpapers_v2");
                case 212:
                    return this.A0K.contains("ab_props:qpl_enabled");
                case 227:
                    return this.A0K.contains("ab_props:video_transcode_retry_enabled");
                case 228:
                    return this.A0K.contains("ab_props:video_transcode_fallback_enabled");
                case 229:
                    return this.A0K.contains("ab_props:dedupe_transcode_images");
                case 230:
                    return this.A0K.contains("ab_props:dedupe_transcode_videos");
                case 231:
                    return this.A0K.contains("ab_props:dedupe_transcode_gif");
                case 232:
                    return this.A0K.contains("ab_props:dedupe_transcode_audio");
                case 233:
                    return this.A0K.contains("ab_props:in_app_support_v2_enabled");
                case 234:
                    return this.A0K.contains("ab_props:disable_new_sticker_animation");
                case 235:
                    return this.A0K.contains("ab_props:enable_mmap_stringpacks");
                case 237:
                    return this.A0K.contains("ab_props:new_sticker_animation_behavior_v2");
                case 238:
                    return this.A0K.contains("ab_props:disable_privatestats_battery");
                case 239:
                    return this.A0K.contains("ab_props:remove_geolocation_videos");
                case 240:
                    return this.A0K.contains("ab_props:sticker_search_enabled");
                case 241:
                    return this.A0K.contains("ab_props:enable_privatestats");
                case 246:
                    return this.A0K.contains("ab_props:upload_status_thumb_mms_enabled");
                case 247:
                    return this.A0K.contains("ab_props:upload_document_thumb_mms_enabled");
                case 248:
                    return this.A0K.contains("ab_props:upload_link_thumb_mms_enabled");
                case 249:
                    return this.A0K.contains("ab_props:download_status_thumb_mms_enabled");
                case 250:
                    return this.A0K.contains("ab_props:download_document_thumb_mms_enabled");
                case 251:
                    return this.A0K.contains("ab_props:download_link_thumb_mms_enabled");
                case 252:
                    return this.A0K.contains("ab_props:send_status_thumb_in_message_disabled");
                case 253:
                    return this.A0K.contains("ab_props:send_document_thumb_in_message_disabled");
                case 254:
                    return this.A0K.contains("ab_props:send_link_thumb_in_message_disabled");
                case 255:
                    return this.A0K.contains("ab_props:animated_stickers_thread_clean_up");
                case 256:
                    return this.A0K.contains("ab_props:media_upload_aggressive_retry_enabled");
                case 257:
                    return this.A0K.contains("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled");
                case 259:
                    return this.A0K.contains("ab_props:enable_catalogs_carts");
                case 263:
                    return this.A0K.contains("ab_props:dedupe_transcode_shared_images");
                case 264:
                    return this.A0K.contains("ab_props:dedupe_transcode_shared_videos");
                case 266:
                    return this.A0K.contains("ab_props:app_locked_with_biometrics");
                case 267:
                    return this.A0K.contains("ab_props:shops_storefront_native_entrypoint_enabled");
                case 270:
                    return this.A0K.contains("ab_props:android_media_use_fresco_for_gifs");
                case 271:
                    return this.A0K.contains("ab_props:sticker_tray_animation_finite_loops");
                case 272:
                    return this.A0K.contains("ab_props:sticker_tray_animation_first_row");
                case 273:
                    return this.A0K.contains("ab_props:sticker_tray_animation_fully_visible_items");
                case 274:
                    return this.A0K.contains("ab_props:pen_smoothing_enabled");
                case 276:
                    return this.A0K.contains("ab_props:sticker_picker_animated_sticker_shrinking");
                case 278:
                    return this.A0K.contains("ab_props:status_grid_enabled");
                case 279:
                    return this.A0K.contains("ab_props:pencil_ui_enhancements_wave_1_enabled");
                case 280:
                    return this.A0K.contains("ab_props:android_push_notify_fg_service");
                case 281:
                    return this.A0K.contains("ab_props:enable_long_running_job_monitor");
                case 283:
                    return this.A0K.contains("ab_props:android_push_config_muted_chats");
                case 290:
                    return this.A0K.contains("ab_props:third_party_animated_sticker_import");
                case 291:
                    return this.A0K.contains("ab_props:sticker_contextual_suggestion_enabled");
                case 292:
                    return this.A0K.contains("ab_props:android_us_language_selector");
                case 295:
                    return this.A0K.contains("ab_props:disable_third_party_animated_sticker_animation");
                case 296:
                    return this.A0K.contains("ab_props:stanza_processing_logging_enabled");
                case 297:
                    return this.A0K.contains("ab_props:edit_business_profile_new_mode_enabled");
                case 306:
                    return this.A0K.contains("ab_props:smb_better_catalog_upload_enabled");
                case 307:
                    return this.A0K.contains("ab_props:payments_bloks_rendercore_enabled");
                case 308:
                    return this.A0K.contains("ab_props:groups_dogfooding_ui");
                case 309:
                    return this.A0K.contains("ab_props:md_icdc_enabled");
                case 311:
                    return this.A0K.contains("ab_props:watls_enable_early_data_http_post");
                case 312:
                    return this.A0K.contains("ab_props:watls_enable_early_data_http_get");
                case 314:
                    return this.A0K.contains("ab_props:yt_video_preview");
                case 315:
                    return this.A0K.contains("ab_props:stop_abprops_traffic_in_serverprops_response");
                case 316:
                    return this.A0K.contains("ab_props:disable_buttons_message");
                case 325:
                    return this.A0K.contains("ab_props:mute_video");
                case 332:
                    return this.A0K.contains("ab_props:new_user_location_dialogs_enabled");
                case 334:
                    return this.A0K.contains("ab_props:use_compressed_packfile");
                default:
                    switch (i) {
                        case 95:
                            return this.A0K.contains("ab_props:offline_aa_test_config");
                        case 96:
                            return this.A0K.contains("ab_props:offline_aa_test_config_v2");
                        case 97:
                            return this.A0K.contains("ab_props:stream_progressive_jpeg_enabled");
                        case 98:
                            return this.A0K.contains("ab_props:liger_enabled");
                        case 99:
                            return this.A0K.contains("ab_props:liger_quic_enabled");
                        default:
                            switch (i) {
                                case 101:
                                    return this.A0K.contains("ab_props:mms4_pps_download_thumbnail");
                                case 102:
                                    return this.A0K.contains("ab_props:mms4_pps_download_full_size");
                                case 103:
                                    return this.A0K.contains("ab_props:pjeg_data_saver_enabled");
                                default:
                                    switch (i) {
                                        case 120:
                                            return this.A0K.contains("ab_props:status_collapse_muted");
                                        case 121:
                                            return this.A0K.contains("ab_props:photo_upload_bandwidth_estimation_enabled");
                                        case 122:
                                            return this.A0K.contains("ab_props:photo_download_bandwidth_estimation_enabled");
                                        case 123:
                                            return this.A0K.contains("ab_props:pjpeg_force_download_mid_quality_enabled");
                                        case 124:
                                            return this.A0K.contains("ab_props:dns_over_https_enabled");
                                        case 125:
                                            return this.A0K.contains("ab_props:camera_core_integration_enabled");
                                        default:
                                            switch (i) {
                                                case 131:
                                                    return this.A0K.contains("ab_props:photo_download_realtime_bandwidth_enabled");
                                                case 132:
                                                    return this.A0K.contains("ab_props:wamsys_registration_enabled");
                                                case 133:
                                                    return this.A0K.contains("ab_props:dns_over_https_interleave_enabled");
                                                default:
                                                    switch (i) {
                                                        case 147:
                                                            return this.A0K.contains("ab_props:wamsys_mms_enabled");
                                                        case 148:
                                                            return this.A0K.contains("ab_props:wamsys_registration_v6_enabled");
                                                        case 149:
                                                            return this.A0K.contains("ab_props:mms_media_conn_persist_enabled");
                                                        case 150:
                                                            return this.A0K.contains("ab_props:mms_media_conn_foreground_only_enabled");
                                                        default:
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append("unrecognized field with code ");
                                                            sb.append(i);
                                                            throw new IllegalArgumentException(sb.toString());
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            return this.A0K.contains("ab_props:smb_profile_banner_prioritized_enabled");
        }
    }

    public boolean A0G(String str) {
        if (C007603r.A08()) {
            SharedPreferences sharedPreferences = this.A0K;
            if (C007603r.A08()) {
                str = AnonymousClass008.A0K("prop_override:", str);
            }
            return sharedPreferences.contains(str);
        }
    }

    public final boolean A0H(String str, boolean z) {
        if (A0G(str) && C007603r.A08()) {
            str = AnonymousClass008.A0K("prop_override:", str);
        }
        return this.A0K.getBoolean(str, z);
    }
}
