package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.00g  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC000400g {
    public static int A05;
    public static long A06;
    public static long A07;
    public static C002801l A08 = A01("biz_transitions", "biz_transitions", false);
    public static C002801l A09 = A01("auth_key_logging", "auth_key_logging", false);
    public static C002801l A0A = A01("wam_privatestats_enabled", "wam_privatestats_enabled", false);
    public static C006003a A0B = A02("auth_key_ver", -1);
    public static C006003a A0C = A03("privatestats_token_first_delay_seconds", "privatestats_token_first_delay_seconds", 21600, Integer.valueOf((int) EditorInfoCompat.IME_FLAG_FORCE_ASCII), 172800);
    public static C006003a A0D = A03("privatestats_token_max_expiry_seconds", "privatestats_token_max_expiry_seconds", 86400, 43200, Integer.MAX_VALUE);
    public static C006003a A0E = A03("privatestats_token_prec_lead_seconds", "privatestats_token_prec_lead_seconds", 7200, 1, 43200);
    public static C006003a A0F = A03("privatestats_token_pre_redeem_count", "privatestats_token_pre_redeem_count", 48, 2, Integer.MAX_VALUE);
    public static C006003a A0G = A03("privatestats_upload_jitter_secs", "privatestats_upload_jitter_secs", 45, 0, 150);
    public static C006003a A0H = A03("storage_mgmt_banner_threshold_mb", "storage_mgmt_banner_threshold_mb", 200, 0, Integer.valueOf((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
    public static String A0I;
    public static String A0J;
    public static String A0K;
    public static ArrayList A0L;
    public static final C002801l A0M = A01("account_transfer_enabled", "account_transfer_enabled", false);
    public static final C002801l A0N = A01("add_contact_by_qr_enabled", "add_contact_by_qr_enabled", false);
    public static final C002801l A0O = A01("add_contact_logging_enabled", "add_contact_logging_enabled", false);
    public static final C002801l A0P = A01("anr_process_monitor", "anr_process_monitor", false);
    public static final C002801l A0Q = A01("async_init_fts_migration", "async_init_fts_migration", false);
    public static final C002801l A0R = A01("async_init_md_migrations", "async_init_md_migrations", true);
    public static final C002801l A0S = A01("attachment_picker_refresh", "attachment_picker_refresh", false);
    public static final C002801l A0T = A01("audio_data_for_notification", "audio_data_for_notification", true);
    public static final C002801l A0U = A01("authkey_reset_on_ban", "authkey_reset_on_ban", false);
    public static final C002801l A0V = A01("biz_message_logging_enabled", "biz_message_logging_enabled", false);
    public static final C002801l A0W = A01("bloks_cache_enabled", "bloks_cache_enabled", false);
    public static final C002801l A0X = A01("bloks_shops_enabled", "bloks_shops_enabled", false);
    public static final C002801l A0Y = A01("broadcast_noncontacts", "broadcast_noncontacts", false);
    public static final C002801l A0Z = A01("bsp_system_message_enabled", "bsp_system_message_enabled", false);
    public static final C002801l A0a = A01("bsp_ui", "bsp_ui", false);
    public static final C002801l A0b = A01("calls_row_constraint_layout", "calls_row_constraint_layout", false);
    public static final C002801l A0c = A01("catalog_cart", "catalog_cart", false);
    public static final C002801l A0d = A01("catalog_message", "catalog_message", false);
    public static final C002801l A0e = A01("consumer_content_provider", "consumer_content_provider", true);
    public static final C002801l A0f = A01("consumer_rc_provider", "consumer_rc_provider", false);
    public static final C002801l A0g = A01("ctwa_context_enabled", "ctwa_context_enabled", false);
    public static final C002801l A0h = A01("ctwa_context_enterprise_enabled", "ctwa_context_enterprise_enabled", false);
    public static final C002801l A0i = A01("db_write_to_old_schema_disabled", "db_write_to_old_schema_disabled", false);
    public static final C002801l A0j = A01("deep_link_redirect_enable", "deep_link_redirect_enable", false);
    public static final C002801l A0k = A01("delete_bad_gcm_token", "delete_bad_gcm_token", false);
    public static final C002801l A0l = A01("disable_prewarm", "disable_prewarm", false);
    public static final C002801l A0m = A01("disk_footprint_logging", "disk_footprint_logging", false);
    public static final C002801l A0n = A01("emoji_search_unreleased_languages", "emoji_search_unreleased_languages", false);
    public static final C002801l A0o = A01("enable_backup_passive_mode", "enable_backup_passive_mode", true);
    public static final C002801l A0p = A01("enhanced_archive", "enhanced_archive", false);
    public static final C002801l A0q = A01("enhanced_block_enabled", "enhanced_block_enabled", false);
    public static final C002801l A0r = A01("enhanced_storage_mgmt_sort_fw_score", "enhanced_storage_mgmt_sort_fw_score", false);
    public static final C002801l A0s = A01("entry_point_block_logging_enabled", "entry_point_block_logging_enabled", false);
    public static final C002801l A0t = A01("ephemeral_messages_enabled", "ephemeral_messages_enabled", true);
    public static final C002801l A0u = A01("ephemeral_messages_setting", "ephemeral_messages_setting", false);
    public static final C002801l A0v = A01("ephemeral_pruning_enabled", "ephemeral_pruning_enabled", true);
    public static final C002801l A0w;
    public static final C002801l A0x = A01("fan_out_group_call_enabled", "fan_out_group_call_enabled", false);
    public static final C002801l A0y = A01("fbns_enabled", "fbns_enabled", false);
    public static final C002801l A0z = A01("force_long_connect", "force_long_connect", false);
    public static final C002801l A10 = A01("frequently_forwarded_group_setting", "frequently_forwarded_group_setting", false);
    public static final C002801l A11 = A01("frequently_forwarded_messages", "frequently_forwarded_messages", false);
    public static final C002801l A12 = A01("gif_search_v2", "gif_search_v2", false);
    public static final C002801l A13 = A01("google_drive_enabled", "google_drive_enabled", true);
    public static final C002801l A14 = A01("groups_privacy_blacklist", "groups_privacy_blacklist", false);
    public static final C002801l A15 = A01("groups_v3", "groups_v3", false);
    public static final C002801l A16 = A01("group_call_discoverability_enabled", "group_call_discoverability_enabled", false);
    public static final C002801l A17 = A01("group_call_video_maximization_enabled", "group_call_video_maximization_enabled", false);
    public static final C002801l A18 = A01("group_invite_sending", "group_invite_sending", false);
    public static final C002801l A19 = A01("group_join_permissions", "group_join_permissions", false);
    public static final C002801l A1A = A01("group_qr_codes_enabled", "group_qr_codes_enabled", false);
    public static final C002801l A1B = A01("grp_uii_cleanup", "grp_uii_cleanup", false);
    public static final C002801l A1C = A01("disable_hfm_autodownload", "disable_hfm_autodownload", false);
    public static final C002801l A1D = A01("hfm_string_changes", "hfm_string_changes", false);
    public static final C002801l A1E = A01("hq_image_enabled", "hq_image_enabled", false);
    public static final C002801l A1F = A01("instrument_spam_report_enabled", "instrument_spam_report_enabled", true);
    public static final C002801l A1G = A01("invites_logging_enabled", "invites_logging_enabled", false);
    public static final C002801l A1H;
    public static final C002801l A1I = A01("enable_joinable_group_call_mvp", "enable_joinable_group_call_mvp", false);
    public static final C002801l A1J = A01("linked_devices_re_auth_enabled", "linked_devices_re_auth_enabled", false);
    public static final C002801l A1K = A01("linked_devices_title_enabled", "linked_devices_title_enabled", false);
    public static final C002801l A1L = A01("linked_devices_ui_enabled", "linked_devices_ui_enabled", false);
    public static final C002801l A1M = A01("list_message_reception_disabled", "list_message_reception_disabled", false);
    public static final C002801l A1N = A01("local_backup_in_service", "local_backup_in_service", true);
    public static final C002801l A1O = A01("md_blocklist_v2", "md_blocklist_v2", false);
    public static final C002801l A1P = A01("md_group_notification", "md_group_notification", false);
    public static final C002801l A1Q = A01("md_messaging_enabled", "md_messaging_enabled", false);
    public static final C002801l A1R = A01("syncd_key_rotation_enabled", "syncd_key_rotation_enabled", false);
    public static final C002801l A1S = A01("syncd_mutation_version_check_enabled", "syncd_mutation_version_check_enabled", false);
    public static final C002801l A1T = A01("md_voip_enabled", "md_voip_enabled", false);
    public static final C002801l A1U = A01("media_files_deduplication", "media_files_deduplication", false);
    public static final C002801l A1V = A01("media_quick_edit", "media_quick_edit", false);
    public static final C002801l A1W = A01("message_processing_dedup", "message_processing_dedup", false);
    public static final C002801l A1X = A01("message_qr_enabled", "message_qr_enabled", false);
    public static final C002801l A1Y = A01("mms4_media_conn_persist_enabled", "mms4_media_conn_persist_enabled", false);
    public static final C002801l A1Z = A01("mms4_media_retry_notification_encryption_enabled", "mms4_media_retry_notification_encryption_enabled", false);
    public static final C002801l A1a = A01("mms4_server_error_receipt_encryption_enabled", "mms4_server_error_receipt_encryption_enabled", false);
    public static final C002801l A1b = A01("mms_cat_v1_forward_hot_override_enabled", "mms_cat_v1_forward_hot_override_enabled", true);
    public static final C002801l A1c = A01("mms_chatd_resume_check_over_thrift_enabled", "mms_chatd_resume_check_over_thrift", true);
    public static final C002801l A1d = A01("mms_download_nc_cat", "mms_download_nc_cat", false);
    public static final C002801l A1e = A01("mms_forward_uploading_media_enabled", "mms_forward_uploading_media_enabled", false);
    public static final C002801l A1f = A01("mms_resume_check_chatd", "mms_resume_check_chatd", false);
    public static final C002801l A1g = A01("mms_vcache_aggregation_enabled", "mms_vcache_aggregation_enabled", false);
    public static final C002801l A1h = A01("move_media_folder_from_sister_app", "move_media_folder_from_sister_app", false);
    public static final C002801l A1i = A01("multi_share_file_preview", "multi_share_file_preview", false);
    public static final C002801l A1j = A01("mute_always", "mute_always", false);
    public static final C002801l A1k = A01("new_animation_behavior", "new_animation_behavior", false);
    public static final C002801l A1l = A01("new_commerce_entry_point_enabled", "new_commerce_entry_point_enabled", false);
    public static final C002801l A1m = A01("new_wam_runtime_enabled", "new_wam_runtime_enabled", false);
    public static final C002801l A1n = A01("notif_ch_override_off", "notif_ch_override_off", false);
    public static final C002801l A1o = A01("optimistic_image_processing_enabled", "optimistic_image_processing_enabled", false);
    public static final C002801l A1p = A01("p2m_pay", "p2m_pay", false);
    public static final C002801l A1q = A01("p2p_pay", "p2p_pay", false);
    public static final C002801l A1r = A01("packless_hsm", "packless_hsm", false);
    public static final C002801l A1s = A01("partial_pjpeg_enabled", "partial_pjpeg_enabled", true);
    public static final C002801l A1t = A01("payments_cs_email_disabled", "payments_cs_email_disabled", false);
    public static final C002801l A1u = A01("payments_disable_switch_psp", "payments_disable_switch_psp", false);
    public static final C002801l A1v = A01("novi_p2p", "novi_p2p", false);
    public static final C002801l A1w = A01("payments_upi_qr_scanning", "payments_upi_qr_scanning", false);
    public static final C002801l A1x = A01("payments_request_messages", "payments_request_messages", true);
    public static final C002801l A1y = A01("payments_upi_mandate_enabled", "payments_upi_mandate_enabled", false);
    public static final C002801l A1z = A01("payments_upi_overdraft_account", "payments_upi_overdraft_account", false);
    public static final C002801l A20 = A01("payments_upi_qr_signing", "payments_upi_qr_signing", false);
    public static final C002801l A21 = A01("payments_upi_enable_sim_swap_detection", "payments_upi_enable_sim_swap_detection", false);
    public static final C002801l A22 = A01("payments_upi_view_in_inbox", "payments_upi_view_in_inbox", false);
    public static final C002801l A23 = A01("payment_history_fts_enabled", "payment_history_fts_enabled", false);
    public static final C002801l A24 = A01("pencil_ui_enhancements_wave_1", "pencil_ui_enhancements_wave_1", false);
    public static final C002801l A25 = A01("picture_in_picture_enabled", "picture_in_picture_enabled", false);
    public static final C002801l A26 = A01("portal_optimization_enabled", "p_opt", false);
    public static final C002801l A27 = A01("product_media_attachments", "product_media_attachments", false);
    public static final C002801l A28 = A01("profilo_enabled", "profilo_enabled", false);
    public static final C002801l A29 = A01("qr_scanning", "qr_scanning", false);
    public static final C002801l A2A = A01("quick_message_search_enabled", "quick_message_search_enabled", false);
    public static final C002801l A2B = A01("receipt_processing_dedup", "receipt_processing_dedup", true);
    public static final C002801l A2C = A01("receipt_processing_thread", "receipt_processing_thread", false);
    public static final C002801l A2D = A01("recent_stickers_web_sync", "recent_stickers_web_sync", false);
    public static final C002801l A2E = A01("reg_log_advertiser_id", "reg_log_advertiser_id", false);
    public static final C002801l A2F = A01("reset_skey_on_id_change", "reset_skey_on_id_change", false);
    public static final C002801l A2G = A01("search_by_image", "search_by_image_enabled", false);
    public static final C002801l A2H = A01("search_in_storage_usage", "search_in_storage_usage", false);
    public static final C002801l A2I = A01("shape_picker_png_emojis_enabled", "shape_picker_png_emojis_enabled", false);
    public static final C002801l A2J = A01("shape_picker_v2_enabled", "shape_picker_v2_enabled", false);
    public static final C002801l A2K = A01("share_biz_vcard_enabled", "share_biz_vcard_enabled", false);
    public static final C002801l A2L = A01("smb_upsell_business_profile_enabled", "smb_upsell_business_profile_enabled", false);
    public static final C002801l A2M = A01("smb_upsell_chat_banner_enabled", "smb_upsell_chat_banner_enabled", false);
    public static final C002801l A2N = A01("starred_gifs", "starred_gifs", false);
    public static final C002801l A2O = A01("starred_stickers_web_sync", "starred_stickers_web_sync", false);
    public static final C002801l A2P = A01("status_collapse_muted", "status_collapse_muted", false);
    public static final C002801l A2Q = A01("status_grid", "status_grid", false);
    public static final C002801l A2R = A01("stella_interop_enabled", "stella_interop_enabled", false);
    public static final C002801l A2S = A01("stickers_animation_media", "stickers_animation_media", false);
    public static final C002801l A2T = A01("sticker_notification_preview", "sticker_notification_preview", false);
    public static final C002801l A2U = A01("storage_migration_enabled", "ssm_enabled", false);
    public static final C002801l A2V = A01("suspicious_links", "suspicious_links", false);
    public static final C002801l A2W = A01("template_hsm", "template_hsm", false);
    public static final C002801l A2X = A01("thread_dump_contact_support", "thread_dump_contact_support", false);
    public static final C002801l A2Y = A01("track_battery_metrics", "track_battery_metrics", false);
    public static final C002801l A2Z = A01("triggered_block_enabled", "triggered_block_enabled", false);
    public static final C002801l A2a = A01("user_notice", "user_notice", false);
    public static final C002801l A2b = A01("view_once_read", "view_once_read", false);
    public static final C002801l A2c = A01("view_once_session", "view_once_session", false);
    public static final C002801l A2d = A01("view_once_write", "view_once_write", false);
    public static final C002801l A2e = A01("wallpapers_v2", "wallpapers_v2", false);
    public static final C002801l A2f = A01("wa_msys_crypto", "wa_msys_crypto", false);
    public static final C002801l A2g = A01("wa_msys_fingerprint", "wa_msys_fingerprint", false);
    public static final C002801l A2h = A01("wamsys_mms_enabled", "wamsys_mms_enabled", false);
    public static final C002801l A2i = A01("wam_real_time_enabled", "wam_real_time_enabled", false);
    public static final C002801l A2j = A01("watls_enabled", "watls_enabled", false);
    public static final C002801l A2k = A01("watls_no_dns", "watls_no_dns", false);
    public static final C002801l A2l = A01("watls_prefer_ip6", "watls_prefer_ip6", false);
    public static final C006203c A2m;
    public static final C006003a A2n = A02("animated_sticker_max_size_kb", 500);
    public static final C006003a A2o = A02("animated_sticker_max_total_duration_ms", 60000);
    public static final C006003a A2p = A02("animated_sticker_min_frame_duration_ms", 8);
    public static final C006003a A2q = A02("announcement_toggle_time_hours", 72);
    public static final C006003a A2r = A02("anr_fast_logs_upload_rollout", 0);
    public static final C006003a A2s = A03("async_fast_forward_ttl", "mms_async_fast_forward_ttl", 432000, null, null);
    public static final C006003a A2t = A02("biz_block_reasons_version", 0);
    public static final C006003a A2u = A03("broadcast_list_size_limit", "max_list_recipients", 256, 256, null);
    public static final C006003a A2v = A02("biz_profile_options", 4);
    public static final C006003a A2w = A02("max_keys", 812);
    public static final C006003a A2x = A02("db_blank_me_jid_migration_step", 1);
    public static final C006003a A2y = A02("db_broadcast_me_jid_migration_step", 2);
    public static final C006003a A2z = A02("db_group_participant_migration_step", 2);
    public static final C006003a A30 = A02("db_receipt_migration_step", 3);
    public static final C006003a A31 = A02("direct_db_migration_timeout_in_secs", 180);
    public static final C006003a A32 = A03("document_limit_mb", "file_max_size", 64, 64, null);
    public static final C006003a A33 = A02("ephemeral_drop_column_stage", 0);
    public static final C006003a A34 = A02("ephemeral_group_query_ts", 0);
    public static final C006003a A35 = A03("fieldstats_beacon_chance", "fieldstats_beacon_chance", 0, 0, null);
    public static final C006003a A36 = A03("frequently_forwarded_max_chats", "frequently_forwarded_max", 1, null, null);
    public static final C006003a A37 = A02("frequently_forwarded_threshold", 5);
    public static final C006003a A38 = A02("gif_provider", -1);
    public static final C006003a A39 = A02("group_call_max_participants", 4);
    public static final C006003a A3A = A02("group_description_length", 0);
    public static final C006003a A3B = A03("heartbeat_interval_seconds", "heartbeat_interval", 86400, null, null);
    public static final C006003a A3C = A02("hq_image_bw_threshold", 75);
    public static final C006003a A3D = A02("hq_image_max_edge", 0);
    public static final C006003a A3E = A02("hq_image_quality", 0);
    public static final C006003a A3F = A02("image_max_edge", 1600);
    public static final C006003a A3G = A03("image_max_kbytes", "image_max_kbytes", 1024, 1024, null);
    public static final C006003a A3H = A02("image_quality", 80);
    public static final C006003a A3I = A02("joinable_group_call_client_version", 0);
    public static final C006003a A3J = A02("joinable_group_call_version", 0);
    public static final C006003a A3K = A02("linked_devices_max_count", 4);
    public static final C006003a A3L = A03("places_source", "source", -1, null, null);
    public static final C006003a A3M = A02("max_receipt_processing_time", 5000);
    public static final C006003a A3N = A02("md_mhfs_days", 732);
    public static final C006003a A3O = A02("md_mhfs_limit", 200);
    public static final C006003a A3P = A02("md_opt_in_experience", 0);
    public static final C006003a A3Q = A02("md_mhrs_days", 90);
    public static final C006003a A3R = A03("syncd_additional_mutations_for_key_catch_up", "syncd_additional_mutations_for_key_catch_up", 1, 1, 5);
    public static final C006003a A3S = A03("syncd_inline_mutations_max_count", "syncd_inline_mutations_max_count", 100, 100, 2000);
    public static final C006003a A3T = A03("syncd_keep_alive_mins", "syncd_keep_alive_mins", 1440, 0, 43200);
    public static final C006003a A3U = A03("syncd_key_max_use_days", "syncd_key_max_use_days", 30, 1, 90);
    public static final C006003a A3V = A03("syncd_key_stale_days", "syncd_key_stale_days", 31, 15, 90);
    public static final C006003a A3W = A03("syncd_patch_protobuf_max_size", "syncd_patch_protobuf_max_size", 10, 10, 100);
    public static final C006003a A3X = A03("syncd_wait_for_key_timeout_days", "syncd_wait_for_key_timeout_days", 7, 1, 15);
    public static final C006003a A3Y = A03("media_limit_auto_download_mb", "media_max_autodownload", 32, 0, null);
    public static final C006003a A3Z = A03("media_limit_auto_download_wifi_mb", "media_max_autodownload_wifi_mb", 100, null, null);
    public static final C006003a A3a = A03("media_limit_mb", "media", 16, 16, null);
    public static final C006003a A3b = A03("mms_hot_content_time_span", "mms_hot_content_timespan_in_seconds", 0, null, null);
    public static final C006003a A3c = A02("mms_vcard_autodownload_size_kb", 1024);
    public static final C006003a A3d = A02("multicast_limit_global", 5);
    public static final C006003a A3e = A02("num_days_backup_token_expiry", 14);
    public static final C006003a A3f = A02("one_tap_calling_in_group_chat_size", 4);
    public static final C006003a A3g = A03("overnight_alarms_jitter_limit_in_sec", "overnight_alarms_jitter_limit_in_sec", 0, 0, 300);
    public static final C006003a A3h = A02("partial_pjpeg_bw_threshold", 125);
    public static final C006003a A3i = A03("participants_size_limit", "max_participants", 257, 257, null);
    public static final C006003a A3j = A02("pay_protocol_async_iq", 0);
    public static final C006003a A3k = A03("payments_br_transaction_limit", "payments_transaction_limit", SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, null, null);
    public static final C006003a A3l = A02("payments_upi_first_day_max_transaction_limit", 5000);
    public static final C006003a A3m = A02("payments_upi_intent_transaction_limit", 2000);
    public static final C006003a A3n = A02("payments_upi_transaction_limit", 5000);
    public static final C006003a A3o = A02("payments_upi_transaction_limit_request", 5000);
    public static final C006003a A3p = A02("ping_timeout_s", 32);
    public static final C006003a A3q = A03("prekey_expiration_days", "prekey_expiration_days", 60, 30, 180);
    public static final C006003a A3r = A02("remove_old_chat_notifications", 1);
    public static final C006003a A3s = A02("shops_required_tos_version", 0);
    public static final C006003a A3t = A02("sigquit_anr_detector_64bit_rollover_percent", 0);
    public static final C006003a A3u = A02("sigquit_anr_detector_release_updated_rollout", 0);
    public static final C006003a A3v = A02("status_image_max_edge", 1280);
    public static final C006003a A3w = A02("status_image_quality", 50);
    public static final C006003a A3x = A02("status_video_max_duration", 45);
    public static final C006003a A3y = A03("stella_addressbook_restriction_type", "stella_addressbook_restriction_type", 10, 0, 20);
    public static final C006003a A3z = A03("sticker_file_size_limit_kb", "sticker_file_size_limit_kb", 1024, 0, null);
    public static final C006003a A40 = A03("subject_length_limit", "max_subject", 25, 25, null);
    public static final C006003a A41 = A02("syncd_release", 0);
    public static final C006003a A42 = A02("sync_wifi_threshold_kb", 5000);
    public static final C006003a A43 = A03("template_doc_mime_types_int", "template_doc_mime_types", 0, null, null);
    public static final C006003a A44 = A02("tintagel", 264);
    public static final C006003a A45 = A02("use_downloadable_emoji_int", 0);
    public static final C006003a A46 = A02("vcard_as_document_size_kb", 0);
    public static final C006003a A47 = A02("vcard_max_size_kb", 1024);
    public static final C006003a A48 = A02("video_max_bitrate", 5000);
    public static final C006003a A49 = A02("vname_cert_staleness_threshold", 43200);
    public static final C006003a A4A = A02("wam_buffer_count", 2);
    public static final C006003a A4B = A02("wam_realtime_buffer_count", 8);
    public static final C006003a A4C = A03("web_max_size_kb", "web_max_size_kb", 100, 0, 500);
    public static final C006003a A4D = A02("web_service_delay", 120);
    public static final C006103b A4E;
    public static final C006103b A4F;
    public static final C006103b A4G;
    public static final List A4H = new ArrayList();
    public static final List A4I = new ArrayList();
    public static volatile Boolean A4J;
    public final SharedPreferences A00;
    public final C006303d A01;
    public final AnonymousClass03X A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass038 A04;

    static {
        A02("payments_mx_transaction_limit", 8000);
        A01("payments_indonesia_webview_access", "payments_indonesia_webview_access", false);
        C006103b r8 = new C006103b("payments_cs_email_address", null);
        A4I.add(r8);
        A4F = r8;
        C006103b r82 = new C006103b("payments_cs_phone_number", null);
        A4I.add(r82);
        A4G = r82;
        A01("third_party_animated_sticker", "third_party_animated_sticker", false);
        C006103b r83 = new C006103b("ephemeral_messages_allowed_values", "604800");
        A4I.add(r83);
        A4E = r83;
        A01("bloks_rendercore_enabled", "bloks_rendercore_enabled", false);
        A01("bloks_http_enabled", "bloks_http_enabled", false);
        A01("stringpacks_mmap_enabled", "stringpacks_mmap_enabled", false);
        A01("message_qr_disambiguation_enabled", "message_qr_disambiguation_enabled", false);
        C002801l r13 = new C002801l("enable_export", "enable_export", true);
        A4H.add(r13);
        A0w = r13;
        C002801l r132 = new C002801l("in_app_notification_chat_list", "in_app_notification_chat_list", false);
        A4H.add(r132);
        A1H = r132;
        C006203c r133 = new C006203c();
        A4I.add(r133);
        A2m = r133;
        A01("camelot", "camelot", false);
        A01("roundtable", "roundtable", false);
        A01("room_messenger_upgrade", "room_messenger_upgrade", false);
        A01("business_profile_updated_ui", "business_profile_updated_ui", false);
        A01("business_profile_c2e", "business_profile_c2e", false);
    }

    public AbstractC000400g(AnonymousClass00G r7, AnonymousClass03X r8, AnonymousClass038 r9, C006303d r10, AnonymousClass022 r11) {
        this.A03 = r7;
        this.A02 = r8;
        this.A04 = r9;
        this.A00 = r11.A01(AnonymousClass020.A02);
        this.A01 = r10;
        synchronized (AbstractC000400g.class) {
            A05 = this.A00.getInt("server_props:last_version", 0);
            A07 = this.A00.getLong("groups_server_props_last_refresh_time", 0);
            A0J = this.A00.getString("server_props:config_hash", null);
            A0I = this.A00.getString("server_props:config_key", null);
            A06 = this.A00.getLong("server_props:refresh", 86400000);
            A0L = A04(this.A00.getString("tos_update_v2", null));
            A0K = this.A00.getString("tos_update_v2_version", null);
        }
    }

    public static C002801l A01(String str, String str2, boolean z) {
        C002801l r1 = new C002801l(str, str2, z);
        A4I.add(r1);
        return r1;
    }

    public static C006003a A02(String str, int i) {
        return A03(str, str, i, null, null);
    }

    public static C006003a A03(String str, String str2, int i, Integer num, Integer num2) {
        C006003a r1 = new C006003a(str, str2, i, num, num2);
        A4I.add(r1);
        return r1;
    }

    public static final ArrayList A04(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            for (String str2 : str.split("-")) {
                arrayList.add(Long.valueOf(((long) Integer.parseInt(str2)) * 3600000));
            }
        } catch (NumberFormatException e) {
            arrayList.clear();
            StringBuilder sb = new StringBuilder("serverprops/onServerProperties/format error ");
            sb.append(str);
            Log.e(sb.toString(), e);
        }
        return arrayList;
    }

    public static boolean A05() {
        boolean z;
        synchronized (AbstractC000400g.class) {
            z = false;
            if (!A0L.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    public int A06(C006003a r5) {
        int i;
        synchronized (AbstractC000400g.class) {
            i = this.A00.getInt(A08(r5), r5.A00);
        }
        return i;
    }

    public long A07(int i) {
        synchronized (AbstractC000400g.class) {
            ArrayList arrayList = A0L;
            if (arrayList.size() < i) {
                StringBuilder sb = new StringBuilder();
                sb.append("serverprops/gettosstage/index ");
                sb.append(i);
                sb.append(" ");
                sb.append(this.A00.getString("tos_update_v2", null));
                sb.append(" length:");
                sb.append(A0L.size());
                Log.e(sb.toString());
                return 0;
            }
            return ((Long) arrayList.get(i - 1)).longValue();
        }
    }

    public final String A08(AbstractC002901m r5) {
        if (C007603r.A08()) {
            SharedPreferences sharedPreferences = this.A00;
            String str = r5.A00;
            if (C007603r.A08()) {
                str = AnonymousClass008.A0K("prop_override:", str);
            }
            if (sharedPreferences.contains(str)) {
                if (C007603r.A08()) {
                    return AnonymousClass008.A0K("prop_override:", str);
                }
                return str;
            }
        }
        return r5.A00;
    }

    public String A09(C006103b r5) {
        String string;
        synchronized (AbstractC000400g.class) {
            string = this.A00.getString(A08(r5), r5.A00);
        }
        return string;
    }

    public List A0A() {
        String A092;
        ArrayList arrayList;
        synchronized (AbstractC000400g.class) {
            A092 = A09(A4E);
        }
        try {
            arrayList = new ArrayList();
            String[] split = A092.split(",");
            for (String str : split) {
                arrayList.add(Integer.valueOf(str));
            }
        } catch (Exception unused) {
            arrayList = new ArrayList();
            for (String str2 : "604800".split(",")) {
                arrayList.add(Integer.valueOf(str2));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0231, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0234, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0238, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0246 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass00S r17, X.C07330Xc r18, int r19, java.util.Map r20, int r21, java.lang.String r22, java.lang.String r23, long r24) {
        /*
        // Method dump skipped, instructions count: 752
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC000400g.A0B(X.00S, X.0Xc, int, java.util.Map, int, java.lang.String, java.lang.String, long):void");
    }

    public boolean A0C() {
        return A0D(A0t) && A0D(A0u);
    }

    public boolean A0D(C002801l r5) {
        boolean z;
        synchronized (AbstractC000400g.class) {
            z = this.A00.getBoolean(A08(r5), r5.A00);
        }
        return z;
    }
}
