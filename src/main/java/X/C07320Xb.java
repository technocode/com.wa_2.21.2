package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.whatsapp.jid.UserJid;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.0Xb  reason: invalid class name and case insensitive filesystem */
public class C07320Xb implements AnonymousClass0C0 {
    public static volatile C07320Xb A0J;
    public final AnonymousClass009 A00;
    public final AnonymousClass0EW A01;
    public final C04090Iz A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass09G A04;
    public final C000300f A05;
    public final AnonymousClass0XP A06;
    public final C07330Xc A07;
    public final AnonymousClass01A A08;
    public final AnonymousClass08B A09;
    public final AnonymousClass00S A0A;
    public final AnonymousClass00G A0B;
    public final C02090Ap A0C;
    public final C002701k A0D;
    public final AnonymousClass03O A0E;
    public final AnonymousClass0ET A0F;
    public final AnonymousClass0AR A0G;
    public final C07340Xd A0H;
    public final AnonymousClass00T A0I;

    public C07320Xb(AnonymousClass00G r2, AnonymousClass00S r3, C002701k r4, AnonymousClass02M r5, AnonymousClass009 r6, AnonymousClass00T r7, AnonymousClass0AR r8, C000300f r9, AnonymousClass09G r10, AnonymousClass01A r11, AnonymousClass0EW r12, C07330Xc r13, AnonymousClass08B r14, C04090Iz r15, C07340Xd r16, AnonymousClass0ET r17, C02090Ap r18, AnonymousClass0XP r19, AnonymousClass03O r20) {
        this.A0B = r2;
        this.A0A = r3;
        this.A0D = r4;
        this.A03 = r5;
        this.A00 = r6;
        this.A0I = r7;
        this.A0G = r8;
        this.A05 = r9;
        this.A04 = r10;
        this.A08 = r11;
        this.A01 = r12;
        this.A07 = r13;
        this.A09 = r14;
        this.A02 = r15;
        this.A0H = r16;
        this.A0F = r17;
        this.A0C = r18;
        this.A06 = r19;
        this.A0E = r20;
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{6, 27, 87, 159, 174, 208, 18, 68, 121, 13, 14, 214};
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        int i2;
        AnonymousClass03V r2;
        String str;
        if (i == 6) {
            Bundle bundle = (Bundle) message.obj;
            String string = bundle.getString("gcmToken");
            String string2 = bundle.getString("fbnsToken");
            String string3 = bundle.getString("mutedChatsHash");
            StringBuilder A0S = AnonymousClass008.A0S("AppMessagingXmppHandler/received client config from server; gcmToken=");
            int i3 = 0;
            if (string != null) {
                i2 = string.length();
            } else {
                i2 = 0;
            }
            A0S.append(i2);
            A0S.append(" bytes; fbnsToken=");
            if (string2 != null) {
                i3 = string2.length();
            }
            A0S.append(i3);
            A0S.append(" bytes: mutedChatsHash=");
            A0S.append(string3);
            Log.d(A0S.toString());
            RegistrationIntentService.A02(this.A0B.A00, string);
            if (this.A05.A0D(AbstractC000400g.A0y)) {
                this.A0H.A01(string2);
            }
            return true;
        } else if (i == 18) {
            Object obj = message.obj;
            StringBuilder sb = new StringBuilder("AppMessagingXmppHandler/service_pricing ");
            sb.append(obj);
            Log.d(sb.toString());
            return true;
        } else if (i == 27) {
            int i4 = message.arg2;
            AnonymousClass008.A0u("AppMessagingXmppHandler/clientConfigError/", i4);
            if (i4 == 404) {
                RegistrationIntentService.A02(this.A0B.A00, null);
                if (this.A05.A0D(AbstractC000400g.A0y)) {
                    this.A0H.A01(null);
                }
            }
            return true;
        } else if (i == 68) {
            this.A0I.ANF(new RunnableEBaseShape3S0200000_I0_2(this, ((Bundle) message.obj).getParcelable("stanzaKey"), 40));
            return true;
        } else if (i == 87) {
            if (((Boolean) message.obj).booleanValue()) {
                this.A0C.A01();
            }
            return true;
        } else if (i == 121) {
            AnonymousClass0AR r0 = this.A0G;
            r0.A0S(true);
            r0.A0M((AnonymousClass1XX) ((Bundle) message.obj).getParcelable("stanzaKey"));
            return true;
        } else if (i == 159) {
            long j = ((Bundle) message.obj).getLong("timestampMs");
            AnonymousClass0XP r7 = this.A06;
            if (r7 != null) {
                if (1614443627000L >= j) {
                    AnonymousClass00D r11 = r7.A01;
                    SharedPreferences sharedPreferences = r11.A00;
                    long j2 = sharedPreferences.getLong("client_expiration_time", 0);
                    if (j >= TimeUnit.DAYS.toMillis(3) + r7.A00.A05()) {
                        if (r11 != null) {
                            StringBuilder A0V = AnonymousClass008.A0V("wa-shared-prefs/set-client-expiration-time/", j, " ");
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                            Calendar instance = Calendar.getInstance();
                            instance.setTimeInMillis(j);
                            A0V.append(simpleDateFormat.format(instance.getTime()));
                            Log.i(A0V.toString());
                            sharedPreferences.edit().putLong("client_expiration_time", j).apply();
                        } else {
                            throw null;
                        }
                    } else if (j2 > 0 && j == -1) {
                        if (r11 != null) {
                            Log.i("wa-shared-prefs/clear-client-expiration-time");
                            sharedPreferences.edit().remove("client_expiration_time").apply();
                            return true;
                        }
                        throw null;
                    }
                }
                return true;
            }
            throw null;
        } else if (i != 174) {
            if (i == 208) {
                AnonymousClass0M5 r72 = (AnonymousClass0M5) message.obj;
                C006803i.A02(r72.A0G("protocol", null), 1);
                String A0G2 = r72.A0G("ab_key", null);
                String A0G3 = r72.A0G("hash", null);
                long A042 = C006803i.A04(r72.A0G("refresh", null), 86400) * 1000;
                SparseArray sparseArray = new SparseArray();
                List<AnonymousClass0M5> A0H2 = r72.A0H("prop");
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (AnonymousClass0M5 r10 : A0H2) {
                    if (!TextUtils.isEmpty(r10.A0G("config_code", null))) {
                        sparseArray.append(r10.A04("config_code"), Pair.create(r10.A0F("config_value"), r10.A0G("config_expo_key", null)));
                    } else {
                        sparseIntArray.append(r10.A04("event_code"), r10.A04("sampling_weight"));
                    }
                }
                C002701k r102 = this.A0D;
                AnonymousClass00S r22 = this.A0A;
                synchronized (r102) {
                    SharedPreferences sharedPreferences2 = r102.A0K;
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    edit.putLong("ab_props:sys:refresh", Math.max(A042, 600000L));
                    if (!TextUtils.isEmpty(A0G3)) {
                        C002001d.A36("ab_props:disable_prewarm", C002701k.A02(sparseArray, 15), edit);
                        C002001d.A35("ab_props:disable_prewarm_expo_key", C002701k.A01(sparseArray, 15), edit);
                        C002001d.A34("ab_props:scroll_perf", C002701k.A02(sparseArray, 22), edit);
                        C002001d.A35("ab_props:scroll_perf_expo_key", C002701k.A01(sparseArray, 22), edit);
                        C002001d.A36("ab_props:progressive_jpeg_thumbnail_enabled", C002701k.A02(sparseArray, 24), edit);
                        C002001d.A35("ab_props:progressive_jpeg_thumbnail_enabled_expo_key", C002701k.A01(sparseArray, 24), edit);
                        C002001d.A36("ab_props:reusable_video_player_enabled", C002701k.A02(sparseArray, 46), edit);
                        C002001d.A35("ab_props:reusable_video_player_enabled_expo_key", C002701k.A01(sparseArray, 46), edit);
                        C002001d.A34("ab_props:buffer_for_playback", C002701k.A02(sparseArray, 25), edit);
                        C002001d.A35("ab_props:buffer_for_playback_expo_key", C002701k.A01(sparseArray, 25), edit);
                        C002001d.A36("ab_props:watls_enabled", C002701k.A02(sparseArray, 48), edit);
                        C002001d.A35("ab_props:watls_enabled_expo_key", C002701k.A01(sparseArray, 48), edit);
                        C002001d.A36("ab_props:watls_no_dns", C002701k.A02(sparseArray, 58), edit);
                        C002001d.A35("ab_props:watls_no_dns_expo_key", C002701k.A01(sparseArray, 58), edit);
                        C002001d.A36("ab_props:watls_prefer_ip6", C002701k.A02(sparseArray, 59), edit);
                        C002001d.A35("ab_props:watls_prefer_ip6_expo_key", C002701k.A01(sparseArray, 59), edit);
                        C002001d.A36("ab_props:watls_early_data", C002701k.A02(sparseArray, 65), edit);
                        C002001d.A35("ab_props:watls_early_data_expo_key", C002701k.A01(sparseArray, 65), edit);
                        C002001d.A36("ab_props:watls_enable_early_data_http_post", C002701k.A02(sparseArray, 311), edit);
                        C002001d.A35("ab_props:watls_enable_early_data_http_post_expo_key", C002701k.A01(sparseArray, 311), edit);
                        C002001d.A36("ab_props:watls_enable_early_data_http_get", C002701k.A02(sparseArray, 312), edit);
                        C002001d.A35("ab_props:watls_enable_early_data_http_get_expo_key", C002701k.A01(sparseArray, 312), edit);
                        C002001d.A34("ab_props:media_autodownload_thread_pool_size", C002701k.A02(sparseArray, 49), edit);
                        C002001d.A35("ab_props:media_autodownload_thread_pool_size_expo_key", C002701k.A01(sparseArray, 49), edit);
                        C002001d.A34("ab_props:autodownload_priority_policy", C002701k.A02(sparseArray, 60), edit);
                        C002001d.A35("ab_props:autodownload_priority_policy_expo_key", C002701k.A01(sparseArray, 60), edit);
                        C002001d.A36("ab_props:offline_text_color_change", C002701k.A02(sparseArray, 71), edit);
                        C002001d.A35("ab_props:offline_text_color_change_expo_key", C002701k.A01(sparseArray, 71), edit);
                        C002001d.A36("ab_props:mms_tcp_congestion_bbr", C002701k.A02(sparseArray, 72), edit);
                        C002001d.A35("ab_props:mms_tcp_congestion_bbr_expo_key", C002701k.A01(sparseArray, 72), edit);
                        C002001d.A36("ab_props:camelot", C002701k.A02(sparseArray, 177), edit);
                        C002001d.A35("ab_props:camelot_expo_key", C002701k.A01(sparseArray, 177), edit);
                        C002001d.A36("ab_props:roundtable", C002701k.A02(sparseArray, 178), edit);
                        C002001d.A35("ab_props:roundtable_expo_key", C002701k.A01(sparseArray, 178), edit);
                        C002001d.A36("ab_props:room_messenger_upgrade", C002701k.A02(sparseArray, 179), edit);
                        C002001d.A35("ab_props:room_messenger_upgrade_expo_key", C002701k.A01(sparseArray, 179), edit);
                        C002001d.A36("ab_props:whats_my_number_enabled", C002701k.A02(sparseArray, 75), edit);
                        C002001d.A35("ab_props:whats_my_number_enabled_expo_key", C002701k.A01(sparseArray, 75), edit);
                        C002001d.A36("ab_props:sms_retriever_first", C002701k.A02(sparseArray, 91), edit);
                        C002001d.A35("ab_props:sms_retriever_first_expo_key", C002701k.A01(sparseArray, 91), edit);
                        C002001d.A36("ab_props:offline_aa_test_config", C002701k.A02(sparseArray, 95), edit);
                        C002001d.A35("ab_props:offline_aa_test_config_expo_key", C002701k.A01(sparseArray, 95), edit);
                        C002001d.A36("ab_props:offline_aa_test_config_v2", C002701k.A02(sparseArray, 96), edit);
                        C002001d.A35("ab_props:offline_aa_test_config_v2_expo_key", C002701k.A01(sparseArray, 96), edit);
                        C002001d.A36("ab_props:consumer_reg_profile_design", C002701k.A02(sparseArray, 77), edit);
                        C002001d.A35("ab_props:consumer_reg_profile_design_expo_key", C002701k.A01(sparseArray, 77), edit);
                        C002001d.A36("ab_props:status_fast_streaming_enable_test", C002701k.A02(sparseArray, 79), edit);
                        C002001d.A35("ab_props:status_fast_streaming_enable_test_expo_key", C002701k.A01(sparseArray, 79), edit);
                        C002001d.A34("ab_props:status_fast_streaming_initial_buffering_second_test", C002701k.A02(sparseArray, 80), edit);
                        C002001d.A35("ab_props:status_fast_streaming_initial_buffering_second_test_expo_key", C002701k.A01(sparseArray, 80), edit);
                        C002001d.A34("ab_props:status_fast_streaming_unstall_second_test", C002701k.A02(sparseArray, 81), edit);
                        C002001d.A35("ab_props:status_fast_streaming_unstall_second_test_expo_key", C002701k.A01(sparseArray, 81), edit);
                        C002001d.A33("ab_props:status_fast_streaming_unstall_multiplier_test", C002701k.A02(sparseArray, 82), edit);
                        C002001d.A35("ab_props:status_fast_streaming_unstall_multiplier_test_expo_key", C002701k.A01(sparseArray, 82), edit);
                        C002001d.A33("ab_props:status_aggressive_prefetch_seconds", C002701k.A02(sparseArray, 92), edit);
                        C002001d.A35("ab_props:status_aggressive_prefetch_seconds_expo_key", C002701k.A01(sparseArray, 92), edit);
                        C002001d.A34("ab_props:image_max_edge_test", C002701k.A02(sparseArray, 86), edit);
                        C002001d.A35("ab_props:image_max_edge_test_expo_key", C002701k.A01(sparseArray, 86), edit);
                        C002001d.A34("ab_props:status_image_max_edge_test", C002701k.A02(sparseArray, 87), edit);
                        C002001d.A35("ab_props:status_image_max_edge_test_expo_key", C002701k.A01(sparseArray, 87), edit);
                        C002001d.A34("ab_props:image_compression_quality_test", C002701k.A02(sparseArray, 88), edit);
                        C002001d.A35("ab_props:image_compression_quality_test_expo_key", C002701k.A01(sparseArray, 88), edit);
                        C002001d.A34("ab_props:status_image_compression_quality_test", C002701k.A02(sparseArray, 89), edit);
                        C002001d.A35("ab_props:status_image_compression_quality_test_expo_key", C002701k.A01(sparseArray, 89), edit);
                        C002001d.A34("ab_props:image_quality_group", C002701k.A02(sparseArray, 90), edit);
                        C002001d.A35("ab_props:image_quality_group_expo_key", C002701k.A01(sparseArray, 90), edit);
                        C002001d.A36("ab_props:stream_progressive_jpeg_enabled", C002701k.A02(sparseArray, 97), edit);
                        C002001d.A35("ab_props:stream_progressive_jpeg_enabled_expo_key", C002701k.A01(sparseArray, 97), edit);
                        C002001d.A36("ab_props:liger_enabled", C002701k.A02(sparseArray, 98), edit);
                        C002001d.A35("ab_props:liger_enabled_expo_key", C002701k.A01(sparseArray, 98), edit);
                        C002001d.A36("ab_props:liger_quic_enabled", C002701k.A02(sparseArray, 99), edit);
                        C002001d.A35("ab_props:liger_quic_enabled_expo_key", C002701k.A01(sparseArray, 99), edit);
                        C002001d.A36("ab_props:mms4_pps_download_thumbnail", C002701k.A02(sparseArray, 101), edit);
                        C002001d.A35("ab_props:mms4_pps_download_thumbnail_expo_key", C002701k.A01(sparseArray, 101), edit);
                        C002001d.A36("ab_props:mms4_pps_download_full_size", C002701k.A02(sparseArray, 102), edit);
                        C002001d.A35("ab_props:mms4_pps_download_full_size_expo_key", C002701k.A01(sparseArray, 102), edit);
                        C002001d.A36("ab_props:pjeg_data_saver_enabled", C002701k.A02(sparseArray, 103), edit);
                        C002001d.A35("ab_props:pjeg_data_saver_enabled_expo_key", C002701k.A01(sparseArray, 103), edit);
                        C002001d.A36("ab_props:pjpeg_status_data_saver_enabled", C002701k.A02(sparseArray, 109), edit);
                        C002001d.A35("ab_props:pjpeg_status_data_saver_enabled_expo_key", C002701k.A01(sparseArray, 109), edit);
                        C002001d.A36("ab_props:pjpeg_chat_data_saver_enabled", C002701k.A02(sparseArray, 110), edit);
                        C002001d.A35("ab_props:pjpeg_chat_data_saver_enabled_expo_key", C002701k.A01(sparseArray, 110), edit);
                        C002001d.A34("ab_props:download_full_pjpeg_max_edge", C002701k.A02(sparseArray, 112), edit);
                        C002001d.A35("ab_props:download_full_pjpeg_max_edge_expo_key", C002701k.A01(sparseArray, 112), edit);
                        C002001d.A34("ab_props:download_full_pjpeg_max_edge_status", C002701k.A02(sparseArray, 113), edit);
                        C002001d.A35("ab_props:download_full_pjpeg_max_edge_status_expo_key", C002701k.A01(sparseArray, 113), edit);
                        C002001d.A34("ab_props:higher_image_max_edge", C002701k.A02(sparseArray, 114), edit);
                        C002001d.A35("ab_props:higher_image_max_edge_expo_key", C002701k.A01(sparseArray, 114), edit);
                        C002001d.A34("ab_props:higher_image_max_edge_status", C002701k.A02(sparseArray, 115), edit);
                        C002001d.A35("ab_props:higher_image_max_edge_status_expo_key", C002701k.A01(sparseArray, 115), edit);
                        C002001d.A34("ab_props:image_max_kb_for_skipping_compression", C002701k.A02(sparseArray, 126), edit);
                        C002001d.A35("ab_props:image_max_kb_for_skipping_compression_expo_key", C002701k.A01(sparseArray, 126), edit);
                        C002001d.A34("ab_props:higher_image_quality", C002701k.A02(sparseArray, 116), edit);
                        C002001d.A35("ab_props:higher_image_quality_expo_key", C002701k.A01(sparseArray, 116), edit);
                        C002001d.A34("ab_props:higher_image_quality_status", C002701k.A02(sparseArray, 117), edit);
                        C002001d.A35("ab_props:higher_image_quality_status_expo_key", C002701k.A01(sparseArray, 117), edit);
                        C002001d.A36("ab_props:new_wam_runtime_enabled", C002701k.A02(sparseArray, 118), edit);
                        C002001d.A35("ab_props:new_wam_runtime_enabled_expo_key", C002701k.A01(sparseArray, 118), edit);
                        C002001d.A34("ab_props:new_wam_runtime_beaconing", C002701k.A02(sparseArray, 119), edit);
                        C002001d.A35("ab_props:new_wam_runtime_beaconing_expo_key", C002701k.A01(sparseArray, 119), edit);
                        C002001d.A36("ab_props:status_collapse_muted", C002701k.A02(sparseArray, 120), edit);
                        C002001d.A35("ab_props:status_collapse_muted_expo_key", C002701k.A01(sparseArray, 120), edit);
                        C002001d.A36("ab_props:photo_upload_bandwidth_estimation_enabled", C002701k.A02(sparseArray, 121), edit);
                        C002001d.A35("ab_props:photo_upload_bandwidth_estimation_enabled_expo_key", C002701k.A01(sparseArray, 121), edit);
                        C002001d.A36("ab_props:photo_download_bandwidth_estimation_enabled", C002701k.A02(sparseArray, 122), edit);
                        C002001d.A35("ab_props:photo_download_bandwidth_estimation_enabled_expo_key", C002701k.A01(sparseArray, 122), edit);
                        C002001d.A36("ab_props:pjpeg_force_download_mid_quality_enabled", C002701k.A02(sparseArray, 123), edit);
                        C002001d.A35("ab_props:pjpeg_force_download_mid_quality_enabled_expo_key", C002701k.A01(sparseArray, 123), edit);
                        C002001d.A36("ab_props:dns_over_https_enabled", C002701k.A02(sparseArray, 124), edit);
                        C002001d.A35("ab_props:dns_over_https_enabled_expo_key", C002701k.A01(sparseArray, 124), edit);
                        C002001d.A36("ab_props:dns_over_https_interleave_enabled", C002701k.A02(sparseArray, 133), edit);
                        C002001d.A35("ab_props:dns_over_https_interleave_enabled_expo_key", C002701k.A01(sparseArray, 133), edit);
                        C002001d.A36("ab_props:camera_core_integration_enabled", C002701k.A02(sparseArray, 125), edit);
                        C002001d.A35("ab_props:camera_core_integration_enabled_expo_key", C002701k.A01(sparseArray, 125), edit);
                        C002001d.A34("ab_props:bandwidth_estimation_algorithm", C002701k.A02(sparseArray, 127), edit);
                        C002001d.A35("ab_props:bandwidth_estimation_algorithm_expo_key", C002701k.A01(sparseArray, 127), edit);
                        C002001d.A36("ab_props:bandwidth_estimation_adjacent_hours_optimization", C002701k.A02(sparseArray, 154), edit);
                        C002001d.A35("ab_props:bandwidth_estimation_adjacent_hours_optimization_expo_key", C002701k.A01(sparseArray, 154), edit);
                        C002001d.A36("ab_props:lazy_camera_view_inflation", C002701k.A02(sparseArray, 128), edit);
                        C002001d.A35("ab_props:lazy_camera_view_inflation_expo_key", C002701k.A01(sparseArray, 128), edit);
                        C002001d.A34("ab_props:sender_higher_quality_bandwidth_threshold", C002701k.A02(sparseArray, 129), edit);
                        C002001d.A35("ab_props:sender_higher_quality_bandwidth_threshold_expo_key", C002701k.A01(sparseArray, 129), edit);
                        C002001d.A34("ab_props:receiver_higher_quality_bandwidth_threshold", C002701k.A02(sparseArray, 130), edit);
                        C002001d.A35("ab_props:receiver_higher_quality_bandwidth_threshold_expo_key", C002701k.A01(sparseArray, 130), edit);
                        C002001d.A36("ab_props:photo_download_realtime_bandwidth_enabled", C002701k.A02(sparseArray, 131), edit);
                        C002001d.A35("ab_props:photo_download_realtime_bandwidth_enabled_expo_key", C002701k.A01(sparseArray, 131), edit);
                        C002001d.A36("ab_props:wamsys_registration_enabled", C002701k.A02(sparseArray, 132), edit);
                        C002001d.A35("ab_props:wamsys_registration_enabled_expo_key", C002701k.A01(sparseArray, 132), edit);
                        C002001d.A34("ab_props:wamsys_registration_value", C002701k.A02(sparseArray, 134), edit);
                        C002001d.A35("ab_props:wamsys_registration_value_expo_key", C002701k.A01(sparseArray, 134), edit);
                        C002001d.A36("ab_props:wamsys_registration_v3_enabled", C002701k.A02(sparseArray, 140), edit);
                        C002001d.A35("ab_props:wamsys_registration_v3_enabled_expo_key", C002701k.A01(sparseArray, 140), edit);
                        C002001d.A36("ab_props:wamsys_registration_v4_enabled", C002701k.A02(sparseArray, 143), edit);
                        C002001d.A35("ab_props:wamsys_registration_v4_enabled_expo_key", C002701k.A01(sparseArray, 143), edit);
                        C002001d.A36("ab_props:wamsys_registration_v5_enabled", C002701k.A02(sparseArray, 145), edit);
                        C002001d.A35("ab_props:wamsys_registration_v5_enabled_expo_key", C002701k.A01(sparseArray, 145), edit);
                        C002001d.A36("ab_props:wamsys_registration_v6_enabled", C002701k.A02(sparseArray, 148), edit);
                        C002001d.A35("ab_props:wamsys_registration_v6_enabled_expo_key", C002701k.A01(sparseArray, 148), edit);
                        C002001d.A34("ab_props:mms_chatd_resume_check_override", C002701k.A02(sparseArray, 136), edit);
                        C002001d.A35("ab_props:mms_chatd_resume_check_override_expo_key", C002701k.A01(sparseArray, 136), edit);
                        C002001d.A36("ab_props:disable_status_autodownload_inactive_users", C002701k.A02(sparseArray, 138), edit);
                        C002001d.A35("ab_props:disable_status_autodownload_inactive_users_expo_key", C002701k.A01(sparseArray, 138), edit);
                        C002001d.A34("ab_props:auto_expo_int_field", C002701k.A02(sparseArray, 142), edit);
                        C002001d.A35("ab_props:auto_expo_int_field_expo_key", C002701k.A01(sparseArray, 142), edit);
                        C002001d.A34("ab_props:auto_expo_status_tab_open", C002701k.A02(sparseArray, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT), edit);
                        C002001d.A35("ab_props:auto_expo_status_tab_open_expo_key", C002701k.A01(sparseArray, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT), edit);
                        C002001d.A36("ab_props:wamsys_mms_enabled", C002701k.A02(sparseArray, 147), edit);
                        C002001d.A35("ab_props:wamsys_mms_enabled_expo_key", C002701k.A01(sparseArray, 147), edit);
                        C002001d.A36("ab_props:mms_media_conn_persist_enabled", C002701k.A02(sparseArray, 149), edit);
                        C002001d.A35("ab_props:mms_media_conn_persist_enabled_expo_key", C002701k.A01(sparseArray, 149), edit);
                        C002001d.A36("ab_props:mms_media_conn_foreground_only_enabled", C002701k.A02(sparseArray, 150), edit);
                        C002001d.A35("ab_props:mms_media_conn_foreground_only_enabled_expo_key", C002701k.A01(sparseArray, 150), edit);
                        C002001d.A35("ab_props:android_camera2_support_level", C002701k.A02(sparseArray, 151), edit);
                        C002001d.A35("ab_props:android_camera2_support_level_expo_key", C002701k.A01(sparseArray, 151), edit);
                        C002001d.A36("ab_props:connect_with_friends_dialog_enabled", C002701k.A02(sparseArray, 152), edit);
                        C002001d.A35("ab_props:connect_with_friends_dialog_enabled_expo_key", C002701k.A01(sparseArray, 152), edit);
                        C002001d.A34("ab_props:max_keys", C002701k.A02(sparseArray, 156), edit);
                        C002001d.A35("ab_props:max_keys_expo_key", C002701k.A01(sparseArray, 156), edit);
                        C002001d.A34("ab_props:video_max_bitrate", C002701k.A02(sparseArray, 157), edit);
                        C002001d.A35("ab_props:video_max_bitrate_expo_key", C002701k.A01(sparseArray, 157), edit);
                        C002001d.A36("ab_props:work_manager_hourly_cron", C002701k.A02(sparseArray, 161), edit);
                        C002001d.A35("ab_props:work_manager_hourly_cron_expo_key", C002701k.A01(sparseArray, 161), edit);
                        C002001d.A36("ab_props:work_manager_ntp_sync", C002701k.A02(sparseArray, 170), edit);
                        C002001d.A35("ab_props:work_manager_ntp_sync_expo_key", C002701k.A01(sparseArray, 170), edit);
                        C002001d.A34("ab_props:media_max_autodownload_wifi_mb", C002701k.A02(sparseArray, 168), edit);
                        C002001d.A35("ab_props:media_max_autodownload_wifi_mb_expo_key", C002701k.A01(sparseArray, 168), edit);
                        C002001d.A34("ab_props:media_max_autodownload", C002701k.A02(sparseArray, 169), edit);
                        C002001d.A35("ab_props:media_max_autodownload_expo_key", C002701k.A01(sparseArray, 169), edit);
                        C002001d.A34("ab_props:status_video_max_duration", C002701k.A02(sparseArray, 175), edit);
                        C002001d.A35("ab_props:status_video_max_duration_expo_key", C002701k.A01(sparseArray, 175), edit);
                        C002001d.A36("ab_props:voip_fix_converter_memory_leak", C002701k.A02(sparseArray, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH), edit);
                        C002001d.A35("ab_props:voip_fix_converter_memory_leak_expo_key", C002701k.A01(sparseArray, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH), edit);
                        C002001d.A36("ab_props:enable_non_wake_up_alarm_ping", C002701k.A02(sparseArray, 180), edit);
                        C002001d.A35("ab_props:enable_non_wake_up_alarm_ping_expo_key", C002701k.A01(sparseArray, 180), edit);
                        C002001d.A36("ab_props:async_init_after_thread_idle", C002701k.A02(sparseArray, 181), edit);
                        C002001d.A35("ab_props:async_init_after_thread_idle_expo_key", C002701k.A01(sparseArray, 181), edit);
                        C002001d.A36("ab_props:wamsys_decryption_individual_enabled", C002701k.A02(sparseArray, 182), edit);
                        C002001d.A35("ab_props:wamsys_decryption_individual_enabled_expo_key", C002701k.A01(sparseArray, 182), edit);
                        C002001d.A36("ab_props:wamsys_encryption_individual_enabled", C002701k.A02(sparseArray, 187), edit);
                        C002001d.A35("ab_props:wamsys_encryption_individual_enabled_expo_key", C002701k.A01(sparseArray, 187), edit);
                        C002001d.A36("ab_props:wamsys_decryption_group_enabled", C002701k.A02(sparseArray, 188), edit);
                        C002001d.A35("ab_props:wamsys_decryption_group_enabled_expo_key", C002701k.A01(sparseArray, 188), edit);
                        C002001d.A36("ab_props:wamsys_encryption_group_enabled", C002701k.A02(sparseArray, 189), edit);
                        C002001d.A35("ab_props:wamsys_encryption_group_enabled_expo_key", C002701k.A01(sparseArray, 189), edit);
                        C002001d.A35("ab_props:android_test_scheduler_api", C002701k.A02(sparseArray, 183), edit);
                        C002001d.A35("ab_props:android_test_scheduler_api_expo_key", C002701k.A01(sparseArray, 183), edit);
                        C002001d.A35("ab_props:android_test_scheduler_period_impl", C002701k.A02(sparseArray, 184), edit);
                        C002001d.A35("ab_props:android_test_scheduler_period_impl_expo_key", C002701k.A01(sparseArray, 184), edit);
                        C002001d.A34("ab_props:android_test_scheduler_period_hours", C002701k.A02(sparseArray, 185), edit);
                        C002001d.A35("ab_props:android_test_scheduler_period_hours_expo_key", C002701k.A01(sparseArray, 185), edit);
                        C002001d.A34("ab_props:android_test_scheduler_run_seconds", C002701k.A02(sparseArray, 186), edit);
                        C002001d.A35("ab_props:android_test_scheduler_run_seconds_expo_key", C002701k.A01(sparseArray, 186), edit);
                        C002001d.A36("ab_props:transsion_badging", C002701k.A02(sparseArray, 190), edit);
                        C002001d.A35("ab_props:transsion_badging_expo_key", C002701k.A01(sparseArray, 190), edit);
                        C002001d.A34("ab_props:enable_hash_based_hybrid_codecs_mask", C002701k.A02(sparseArray, 191), edit);
                        C002001d.A35("ab_props:enable_hash_based_hybrid_codecs_mask_expo_key", C002701k.A01(sparseArray, 191), edit);
                        C002001d.A34("ab_props:upload_thread_lower_priority", C002701k.A02(sparseArray, 192), edit);
                        C002001d.A35("ab_props:upload_thread_lower_priority_expo_key", C002701k.A01(sparseArray, 192), edit);
                        C002001d.A36("ab_props:async_data_load_on_startup", C002701k.A02(sparseArray, 196), edit);
                        C002001d.A35("ab_props:async_data_load_on_startup_expo_key", C002701k.A01(sparseArray, 196), edit);
                        C002001d.A36("ab_props:enable_long_running_job_monitor", C002701k.A02(sparseArray, 281), edit);
                        C002001d.A35("ab_props:enable_long_running_job_monitor_expo_key", C002701k.A01(sparseArray, 281), edit);
                        C002001d.A36("ab_props:bloks_use_minscript_android", C002701k.A02(sparseArray, 198), edit);
                        C002001d.A35("ab_props:bloks_use_minscript_android_expo_key", C002701k.A01(sparseArray, 198), edit);
                        C002001d.A36("ab_props:load_chats_lazily", C002701k.A02(sparseArray, 199), edit);
                        C002001d.A35("ab_props:load_chats_lazily_expo_key", C002701k.A01(sparseArray, 199), edit);
                        C002001d.A36("ab_props:status_ranking", C002701k.A02(sparseArray, 56), edit);
                        C002001d.A35("ab_props:status_ranking_expo_key", C002701k.A01(sparseArray, 56), edit);
                        C002001d.A34("ab_props:db_migration_low_latency_kill_switch_latency", C002701k.A02(sparseArray, 200), edit);
                        C002001d.A35("ab_props:db_migration_low_latency_kill_switch_latency_expo_key", C002701k.A01(sparseArray, 200), edit);
                        C002001d.A36("ab_props:db_migration_low_latency_kill_switch", C002701k.A02(sparseArray, 201), edit);
                        C002001d.A35("ab_props:db_migration_low_latency_kill_switch_expo_key", C002701k.A01(sparseArray, 201), edit);
                        C002001d.A35("ab_props:db_migration_low_latency_kill_switch_experiment", C002701k.A02(sparseArray, 203), edit);
                        C002001d.A35("ab_props:db_migration_low_latency_kill_switch_experiment_expo_key", C002701k.A01(sparseArray, 203), edit);
                        C002001d.A35("ab_props:db_migration_data_source_v1", C002701k.A02(sparseArray, 205), edit);
                        C002001d.A35("ab_props:db_migration_data_source_v1_expo_key", C002701k.A01(sparseArray, 205), edit);
                        C002001d.A35("ab_props:db_migration_data_source_v2", C002701k.A02(sparseArray, 206), edit);
                        C002001d.A35("ab_props:db_migration_data_source_v2_expo_key", C002701k.A01(sparseArray, 206), edit);
                        C002001d.A35("ab_props:db_migration_level_reset", C002701k.A02(sparseArray, 207), edit);
                        C002001d.A35("ab_props:db_migration_level_reset_expo_key", C002701k.A01(sparseArray, 207), edit);
                        C002001d.A35("ab_props:db_migration_level_keep", C002701k.A02(sparseArray, 208), edit);
                        C002001d.A35("ab_props:db_migration_level_keep_expo_key", C002701k.A01(sparseArray, 208), edit);
                        C002001d.A35("ab_props:db_migration_level_migrate", C002701k.A02(sparseArray, 209), edit);
                        C002001d.A35("ab_props:db_migration_level_migrate_expo_key", C002701k.A01(sparseArray, 209), edit);
                        C002001d.A35("ab_props:db_migration_level_force", C002701k.A02(sparseArray, 242), edit);
                        C002001d.A35("ab_props:db_migration_level_force_expo_key", C002701k.A01(sparseArray, 242), edit);
                        C002001d.A34("ab_props:db_migration_max_db_size", C002701k.A02(sparseArray, 261), edit);
                        C002001d.A35("ab_props:db_migration_max_db_size_expo_key", C002701k.A01(sparseArray, 261), edit);
                        C002001d.A35("ab_props:db_migration_release_failure_login_controls", C002701k.A02(sparseArray, 262), edit);
                        C002001d.A35("ab_props:db_migration_release_failure_login_controls_expo_key", C002701k.A01(sparseArray, 262), edit);
                        C002001d.A37("ab_props:db_verification_controls", "{\"config\": [{\"name\":\"all\", \"enabled\":false,\"run_sampling\":10000, \"old_data_sampling\":1000, \"new_data_sampling\":1000, \"critical_event_sampling\":0}]}", C002701k.A02(sparseArray, 277), edit);
                        C002001d.A35("ab_props:db_verification_controls_expo_key", C002701k.A01(sparseArray, 277), edit);
                        C002001d.A35("ab_props:shops_pdp_urls_config", C002701k.A02(sparseArray, 210), edit);
                        C002001d.A35("ab_props:shops_pdp_urls_config_expo_key", C002701k.A01(sparseArray, 210), edit);
                        C002001d.A36("ab_props:shops_storefront_native_entrypoint_enabled", C002701k.A02(sparseArray, 267), edit);
                        C002001d.A35("ab_props:shops_storefront_native_entrypoint_enabled_expo_key", C002701k.A01(sparseArray, 267), edit);
                        C002001d.A36("ab_props:wallpapers_v2", C002701k.A02(sparseArray, 211), edit);
                        C002001d.A35("ab_props:wallpapers_v2_expo_key", C002701k.A01(sparseArray, 211), edit);
                        C002001d.A34("ab_props:low_space_threshold", C002701k.A02(sparseArray, 224), edit);
                        C002001d.A35("ab_props:low_space_threshold_expo_key", C002701k.A01(sparseArray, 224), edit);
                        C002001d.A36("ab_props:video_transcode_retry_enabled", C002701k.A02(sparseArray, 227), edit);
                        C002001d.A35("ab_props:video_transcode_retry_enabled_expo_key", C002701k.A01(sparseArray, 227), edit);
                        C002001d.A36("ab_props:video_transcode_fallback_enabled", C002701k.A02(sparseArray, 228), edit);
                        C002001d.A35("ab_props:video_transcode_fallback_enabled_expo_key", C002701k.A01(sparseArray, 228), edit);
                        C002001d.A36("ab_props:dedupe_transcode_images", C002701k.A02(sparseArray, 229), edit);
                        C002001d.A35("ab_props:dedupe_transcode_images_expo_key", C002701k.A01(sparseArray, 229), edit);
                        C002001d.A36("ab_props:dedupe_transcode_videos", C002701k.A02(sparseArray, 230), edit);
                        C002001d.A35("ab_props:dedupe_transcode_videos_expo_key", C002701k.A01(sparseArray, 230), edit);
                        C002001d.A36("ab_props:dedupe_transcode_shared_images", C002701k.A02(sparseArray, 263), edit);
                        C002001d.A35("ab_props:dedupe_transcode_shared_images_expo_key", C002701k.A01(sparseArray, 263), edit);
                        C002001d.A36("ab_props:dedupe_transcode_shared_videos", C002701k.A02(sparseArray, 264), edit);
                        C002001d.A35("ab_props:dedupe_transcode_shared_videos_expo_key", C002701k.A01(sparseArray, 264), edit);
                        C002001d.A36("ab_props:dedupe_transcode_gif", C002701k.A02(sparseArray, 231), edit);
                        C002001d.A35("ab_props:dedupe_transcode_gif_expo_key", C002701k.A01(sparseArray, 231), edit);
                        C002001d.A36("ab_props:dedupe_transcode_audio", C002701k.A02(sparseArray, 232), edit);
                        C002001d.A35("ab_props:dedupe_transcode_audio_expo_key", C002701k.A01(sparseArray, 232), edit);
                        C002001d.A36("ab_props:in_app_support_v2_enabled", C002701k.A02(sparseArray, 233), edit);
                        C002001d.A35("ab_props:in_app_support_v2_enabled_expo_key", C002701k.A01(sparseArray, 233), edit);
                        C002001d.A36("ab_props:disable_new_sticker_animation", C002701k.A02(sparseArray, 234), edit);
                        C002001d.A35("ab_props:disable_new_sticker_animation_expo_key", C002701k.A01(sparseArray, 234), edit);
                        C002001d.A36("ab_props:enable_mmap_stringpacks", C002701k.A02(sparseArray, 235), edit);
                        C002001d.A35("ab_props:enable_mmap_stringpacks_expo_key", C002701k.A01(sparseArray, 235), edit);
                        C002001d.A36("ab_props:new_sticker_animation_behavior_v2", C002701k.A02(sparseArray, 237), edit);
                        C002001d.A35("ab_props:new_sticker_animation_behavior_v2_expo_key", C002701k.A01(sparseArray, 237), edit);
                        C002001d.A36("ab_props:disable_privatestats_battery", C002701k.A02(sparseArray, 238), edit);
                        C002001d.A35("ab_props:disable_privatestats_battery_expo_key", C002701k.A01(sparseArray, 238), edit);
                        C002001d.A36("ab_props:remove_geolocation_videos", C002701k.A02(sparseArray, 239), edit);
                        C002001d.A35("ab_props:remove_geolocation_videos_expo_key", C002701k.A01(sparseArray, 239), edit);
                        C002001d.A36("ab_props:sticker_search_enabled", C002701k.A02(sparseArray, 240), edit);
                        C002001d.A35("ab_props:sticker_search_enabled_expo_key", C002701k.A01(sparseArray, 240), edit);
                        C002001d.A36("ab_props:enable_privatestats", C002701k.A02(sparseArray, 241), edit);
                        C002001d.A35("ab_props:enable_privatestats_expo_key", C002701k.A01(sparseArray, 241), edit);
                        C002001d.A36("ab_props:upload_status_thumb_mms_enabled", C002701k.A02(sparseArray, 246), edit);
                        C002001d.A35("ab_props:upload_status_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 246), edit);
                        C002001d.A36("ab_props:upload_document_thumb_mms_enabled", C002701k.A02(sparseArray, 247), edit);
                        C002001d.A35("ab_props:upload_document_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 247), edit);
                        C002001d.A36("ab_props:upload_link_thumb_mms_enabled", C002701k.A02(sparseArray, 248), edit);
                        C002001d.A35("ab_props:upload_link_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 248), edit);
                        C002001d.A36("ab_props:download_status_thumb_mms_enabled", C002701k.A02(sparseArray, 249), edit);
                        C002001d.A35("ab_props:download_status_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 249), edit);
                        C002001d.A36("ab_props:download_document_thumb_mms_enabled", C002701k.A02(sparseArray, 250), edit);
                        C002001d.A35("ab_props:download_document_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 250), edit);
                        C002001d.A36("ab_props:download_link_thumb_mms_enabled", C002701k.A02(sparseArray, 251), edit);
                        C002001d.A35("ab_props:download_link_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 251), edit);
                        C002001d.A36("ab_props:send_status_thumb_in_message_disabled", C002701k.A02(sparseArray, 252), edit);
                        C002001d.A35("ab_props:send_status_thumb_in_message_disabled_expo_key", C002701k.A01(sparseArray, 252), edit);
                        C002001d.A36("ab_props:send_document_thumb_in_message_disabled", C002701k.A02(sparseArray, 253), edit);
                        C002001d.A35("ab_props:send_document_thumb_in_message_disabled_expo_key", C002701k.A01(sparseArray, 253), edit);
                        C002001d.A36("ab_props:send_link_thumb_in_message_disabled", C002701k.A02(sparseArray, 254), edit);
                        C002001d.A35("ab_props:send_link_thumb_in_message_disabled_expo_key", C002701k.A01(sparseArray, 254), edit);
                        C002001d.A36("ab_props:animated_stickers_thread_clean_up", C002701k.A02(sparseArray, 255), edit);
                        C002001d.A35("ab_props:animated_stickers_thread_clean_up_expo_key", C002701k.A01(sparseArray, 255), edit);
                        C002001d.A36("ab_props:media_upload_aggressive_retry_enabled", C002701k.A02(sparseArray, 256), edit);
                        C002001d.A35("ab_props:media_upload_aggressive_retry_enabled_expo_key", C002701k.A01(sparseArray, 256), edit);
                        C002001d.A36("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled", C002701k.A02(sparseArray, 257), edit);
                        C002001d.A35("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled_expo_key", C002701k.A01(sparseArray, 257), edit);
                        C002001d.A34("ab_props:media_upload_max_aggressive_retries", C002701k.A02(sparseArray, 258), edit);
                        C002001d.A35("ab_props:media_upload_max_aggressive_retries_expo_key", C002701k.A01(sparseArray, 258), edit);
                        C002001d.A36("ab_props:pen_smoothing_enabled", C002701k.A02(sparseArray, 274), edit);
                        C002001d.A35("ab_props:pen_smoothing_enabled_expo_key", C002701k.A01(sparseArray, 274), edit);
                        C002001d.A36("ab_props:status_grid_enabled", C002701k.A02(sparseArray, 278), edit);
                        C002001d.A35("ab_props:status_grid_enabled_expo_key", C002701k.A01(sparseArray, 278), edit);
                        C002001d.A36("ab_props:pencil_ui_enhancements_wave_1_enabled", C002701k.A02(sparseArray, 279), edit);
                        C002001d.A35("ab_props:pencil_ui_enhancements_wave_1_enabled_expo_key", C002701k.A01(sparseArray, 279), edit);
                        C002001d.A36("ab_props:enable_catalogs_carts", C002701k.A02(sparseArray, 259), edit);
                        C002001d.A35("ab_props:enable_catalogs_carts_expo_key", C002701k.A01(sparseArray, 259), edit);
                        C002001d.A35("ab_props:shops_storefront_urls_config", C002701k.A02(sparseArray, 265), edit);
                        C002001d.A35("ab_props:shops_storefront_urls_config_expo_key", C002701k.A01(sparseArray, 265), edit);
                        C002001d.A36("ab_props:app_locked_with_biometrics", C002701k.A02(sparseArray, 266), edit);
                        C002001d.A35("ab_props:app_locked_with_biometrics_expo_key", C002701k.A01(sparseArray, 266), edit);
                        C002001d.A36("ab_props:android_media_use_fresco_for_gifs", C002701k.A02(sparseArray, 270), edit);
                        C002001d.A35("ab_props:android_media_use_fresco_for_gifs_expo_key", C002701k.A01(sparseArray, 270), edit);
                        C002001d.A36("ab_props:sticker_tray_animation_finite_loops", C002701k.A02(sparseArray, 271), edit);
                        C002001d.A35("ab_props:sticker_tray_animation_finite_loops_expo_key", C002701k.A01(sparseArray, 271), edit);
                        C002001d.A36("ab_props:sticker_tray_animation_first_row", C002701k.A02(sparseArray, 272), edit);
                        C002001d.A35("ab_props:sticker_tray_animation_first_row_expo_key", C002701k.A01(sparseArray, 272), edit);
                        C002001d.A36("ab_props:sticker_tray_animation_fully_visible_items", C002701k.A02(sparseArray, 273), edit);
                        C002001d.A35("ab_props:sticker_tray_animation_fully_visible_items_expo_key", C002701k.A01(sparseArray, 273), edit);
                        C002001d.A36("ab_props:sticker_picker_animated_sticker_shrinking", C002701k.A02(sparseArray, 276), edit);
                        C002001d.A35("ab_props:sticker_picker_animated_sticker_shrinking_expo_key", C002701k.A01(sparseArray, 276), edit);
                        C002001d.A36("ab_props:android_push_notify_fg_service", C002701k.A02(sparseArray, 280), edit);
                        C002001d.A35("ab_props:android_push_notify_fg_service_expo_key", C002701k.A01(sparseArray, 280), edit);
                        C002001d.A34("ab_props:group_chat_message_push_priority_obfuscation_percent", C002701k.A02(sparseArray, 282), edit);
                        C002001d.A35("ab_props:group_chat_message_push_priority_obfuscation_percent_expo_key", C002701k.A01(sparseArray, 282), edit);
                        C002001d.A36("ab_props:android_push_config_muted_chats", C002701k.A02(sparseArray, 283), edit);
                        C002001d.A35("ab_props:android_push_config_muted_chats_expo_key", C002701k.A01(sparseArray, 283), edit);
                        C002001d.A36("ab_props:third_party_animated_sticker_import", C002701k.A02(sparseArray, 290), edit);
                        C002001d.A35("ab_props:third_party_animated_sticker_import_expo_key", C002701k.A01(sparseArray, 290), edit);
                        C002001d.A36("ab_props:sticker_contextual_suggestion_enabled", C002701k.A02(sparseArray, 291), edit);
                        C002001d.A35("ab_props:sticker_contextual_suggestion_enabled_expo_key", C002701k.A01(sparseArray, 291), edit);
                        C002001d.A36("ab_props:disable_third_party_animated_sticker_animation", C002701k.A02(sparseArray, 295), edit);
                        C002001d.A35("ab_props:disable_third_party_animated_sticker_animation_expo_key", C002701k.A01(sparseArray, 295), edit);
                        C002001d.A36("ab_props:yt_video_preview", C002701k.A02(sparseArray, 314), edit);
                        C002001d.A35("ab_props:yt_video_preview_expo_key", C002701k.A01(sparseArray, 314), edit);
                        C002001d.A36("ab_props:android_us_language_selector", C002701k.A02(sparseArray, 292), edit);
                        C002001d.A35("ab_props:android_us_language_selector_expo_key", C002701k.A01(sparseArray, 292), edit);
                        C002001d.A36("ab_props:stanza_processing_logging_enabled", C002701k.A02(sparseArray, 296), edit);
                        C002001d.A35("ab_props:stanza_processing_logging_enabled_expo_key", C002701k.A01(sparseArray, 296), edit);
                        C002001d.A34("ab_props:privatestats_upload_jitter_secs", C002701k.A02(sparseArray, 305), edit);
                        C002001d.A35("ab_props:privatestats_upload_jitter_secs_expo_key", C002701k.A01(sparseArray, 305), edit);
                        C002001d.A36("ab_props:payments_bloks_rendercore_enabled", C002701k.A02(sparseArray, 307), edit);
                        C002001d.A35("ab_props:payments_bloks_rendercore_enabled_expo_key", C002701k.A01(sparseArray, 307), edit);
                        C002001d.A36("ab_props:groups_dogfooding_ui", C002701k.A02(sparseArray, 308), edit);
                        C002001d.A35("ab_props:groups_dogfooding_ui_expo_key", C002701k.A01(sparseArray, 308), edit);
                        C002001d.A36("ab_props:md_icdc_enabled", C002701k.A02(sparseArray, 309), edit);
                        C002001d.A35("ab_props:md_icdc_enabled_expo_key", C002701k.A01(sparseArray, 309), edit);
                        C002001d.A34("ab_props:md_icdc_hash_length", C002701k.A02(sparseArray, 310), edit);
                        C002001d.A35("ab_props:md_icdc_hash_length_expo_key", C002701k.A01(sparseArray, 310), edit);
                        C002001d.A36("ab_props:disable_buttons_message", C002701k.A02(sparseArray, 316), edit);
                        C002001d.A35("ab_props:disable_buttons_message_expo_key", C002701k.A01(sparseArray, 316), edit);
                        C002001d.A36("ab_props:mute_video", C002701k.A02(sparseArray, 325), edit);
                        C002001d.A35("ab_props:mute_video_expo_key", C002701k.A01(sparseArray, 325), edit);
                        C002001d.A36("ab_props:new_user_location_dialogs_enabled", C002701k.A02(sparseArray, 332), edit);
                        C002001d.A35("ab_props:new_user_location_dialogs_enabled_expo_key", C002701k.A01(sparseArray, 332), edit);
                        C002001d.A36("ab_props:use_compressed_packfile", C002701k.A02(sparseArray, 334), edit);
                        C002001d.A35("ab_props:use_compressed_packfile_expo_key", C002701k.A01(sparseArray, 334), edit);
                        C002001d.A36("ab_props:new_business_profile_info_view_enabled", C002701k.A02(sparseArray, 37), edit);
                        C002001d.A35("ab_props:new_business_profile_info_view_enabled_expo_key", C002701k.A01(sparseArray, 37), edit);
                        C002001d.A36("ab_props:smb_profile_banner_new_copy_enabled", C002701k.A02(sparseArray, 158), edit);
                        C002001d.A35("ab_props:smb_profile_banner_new_copy_enabled_expo_key", C002701k.A01(sparseArray, 158), edit);
                        C002001d.A36("ab_props:smb_profile_banner_prioritized_enabled", C002701k.A02(sparseArray, 159), edit);
                        C002001d.A35("ab_props:smb_profile_banner_prioritized_enabled_expo_key", C002701k.A01(sparseArray, 159), edit);
                        C002001d.A34("ab_props:smb_banner_max_display_days", C002701k.A02(sparseArray, 163), edit);
                        C002001d.A35("ab_props:smb_banner_max_display_days_expo_key", C002701k.A01(sparseArray, 163), edit);
                        C002001d.A34("ab_props:smb_banner_max_click_count", C002701k.A02(sparseArray, 164), edit);
                        C002001d.A35("ab_props:smb_banner_max_click_count_expo_key", C002701k.A01(sparseArray, 164), edit);
                        C002001d.A34("ab_props:smb_banner_max_dismiss_count", C002701k.A02(sparseArray, 165), edit);
                        C002001d.A35("ab_props:smb_banner_max_dismiss_count_expo_key", C002701k.A01(sparseArray, 165), edit);
                        C002001d.A34("ab_props:smb_banner_display_days_consec", C002701k.A02(sparseArray, 166), edit);
                        C002001d.A35("ab_props:smb_banner_display_days_consec_expo_key", C002701k.A01(sparseArray, 166), edit);
                        C002001d.A34("ab_props:smb_days_between_banner", C002701k.A02(sparseArray, 167), edit);
                        C002001d.A35("ab_props:smb_days_between_banner_expo_key", C002701k.A01(sparseArray, 167), edit);
                        C002001d.A36("ab_props:edit_business_profile_new_mode_enabled", C002701k.A02(sparseArray, 297), edit);
                        C002001d.A35("ab_props:edit_business_profile_new_mode_enabled_expo_key", C002701k.A01(sparseArray, 297), edit);
                        C002001d.A36("ab_props:smb_better_catalog_upload_enabled", C002701k.A02(sparseArray, 306), edit);
                        C002001d.A35("ab_props:smb_better_catalog_upload_enabled_expo_key", C002701k.A01(sparseArray, 306), edit);
                        C002001d.A36("ab_props:qpl_enabled", C002701k.A02(sparseArray, 212), edit);
                        C002001d.A35("ab_props:qpl_enabled_expo_key", C002701k.A01(sparseArray, 212), edit);
                        C002001d.A34("ab_props:qpl_max_file_size", C002701k.A02(sparseArray, 213), edit);
                        C002001d.A35("ab_props:qpl_max_file_size_expo_key", C002701k.A01(sparseArray, 213), edit);
                        C002001d.A34("ab_props:qpl_max_file_count", C002701k.A02(sparseArray, 214), edit);
                        C002001d.A35("ab_props:qpl_max_file_count_expo_key", C002701k.A01(sparseArray, 214), edit);
                        C002001d.A34("ab_props:qpl_upload_delay", C002701k.A02(sparseArray, 215), edit);
                        C002001d.A35("ab_props:qpl_upload_delay_expo_key", C002701k.A01(sparseArray, 215), edit);
                        C002001d.A34("ab_props:qpl_seed", C002701k.A02(sparseArray, 225), edit);
                        C002001d.A35("ab_props:qpl_seed_expo_key", C002701k.A01(sparseArray, 225), edit);
                        C002001d.A37("ab_props:qpl_sampling", "{\"sampling\":[]}", C002701k.A02(sparseArray, 226), edit);
                        C002001d.A35("ab_props:qpl_sampling_expo_key", C002701k.A01(sparseArray, 226), edit);
                        C002001d.A36("ab_props:stop_abprops_traffic_in_serverprops_response", C002701k.A02(sparseArray, 315), edit);
                        C002001d.A35("ab_props:stop_abprops_traffic_in_serverprops_response_expo_key", C002701k.A01(sparseArray, 315), edit);
                        C002001d.A34("ab_props:abprops_beta_pull_frequency", C002701k.A02(sparseArray, 327), edit);
                        C002001d.A35("ab_props:abprops_beta_pull_frequency_expo_key", C002701k.A01(sparseArray, 327), edit);
                        C002001d.A35("ab_props:disable_prewarm_expo_key", C002701k.A01(sparseArray, 15), edit);
                        C002001d.A35("ab_props:scroll_perf_expo_key", C002701k.A01(sparseArray, 22), edit);
                        C002001d.A35("ab_props:progressive_jpeg_thumbnail_enabled_expo_key", C002701k.A01(sparseArray, 24), edit);
                        C002001d.A35("ab_props:reusable_video_player_enabled_expo_key", C002701k.A01(sparseArray, 46), edit);
                        C002001d.A35("ab_props:buffer_for_playback_expo_key", C002701k.A01(sparseArray, 25), edit);
                        C002001d.A35("ab_props:watls_enabled_expo_key", C002701k.A01(sparseArray, 48), edit);
                        C002001d.A35("ab_props:watls_no_dns_expo_key", C002701k.A01(sparseArray, 58), edit);
                        C002001d.A35("ab_props:watls_prefer_ip6_expo_key", C002701k.A01(sparseArray, 59), edit);
                        C002001d.A35("ab_props:watls_early_data_expo_key", C002701k.A01(sparseArray, 65), edit);
                        C002001d.A35("ab_props:watls_enable_early_data_http_post_expo_key", C002701k.A01(sparseArray, 311), edit);
                        C002001d.A35("ab_props:watls_enable_early_data_http_get_expo_key", C002701k.A01(sparseArray, 312), edit);
                        C002001d.A35("ab_props:media_autodownload_thread_pool_size_expo_key", C002701k.A01(sparseArray, 49), edit);
                        C002001d.A35("ab_props:autodownload_priority_policy_expo_key", C002701k.A01(sparseArray, 60), edit);
                        C002001d.A35("ab_props:offline_text_color_change_expo_key", C002701k.A01(sparseArray, 71), edit);
                        C002001d.A35("ab_props:mms_tcp_congestion_bbr_expo_key", C002701k.A01(sparseArray, 72), edit);
                        C002001d.A35("ab_props:camelot_expo_key", C002701k.A01(sparseArray, 177), edit);
                        C002001d.A35("ab_props:roundtable_expo_key", C002701k.A01(sparseArray, 178), edit);
                        C002001d.A35("ab_props:room_messenger_upgrade_expo_key", C002701k.A01(sparseArray, 179), edit);
                        C002001d.A35("ab_props:whats_my_number_enabled_expo_key", C002701k.A01(sparseArray, 75), edit);
                        C002001d.A35("ab_props:sms_retriever_first_expo_key", C002701k.A01(sparseArray, 91), edit);
                        C002001d.A35("ab_props:offline_aa_test_config_expo_key", C002701k.A01(sparseArray, 95), edit);
                        C002001d.A35("ab_props:offline_aa_test_config_v2_expo_key", C002701k.A01(sparseArray, 96), edit);
                        C002001d.A35("ab_props:consumer_reg_profile_design_expo_key", C002701k.A01(sparseArray, 77), edit);
                        C002001d.A35("ab_props:status_fast_streaming_enable_test_expo_key", C002701k.A01(sparseArray, 79), edit);
                        C002001d.A35("ab_props:status_fast_streaming_initial_buffering_second_test_expo_key", C002701k.A01(sparseArray, 80), edit);
                        C002001d.A35("ab_props:status_fast_streaming_unstall_second_test_expo_key", C002701k.A01(sparseArray, 81), edit);
                        C002001d.A35("ab_props:status_fast_streaming_unstall_multiplier_test_expo_key", C002701k.A01(sparseArray, 82), edit);
                        C002001d.A35("ab_props:status_aggressive_prefetch_seconds_expo_key", C002701k.A01(sparseArray, 92), edit);
                        C002001d.A35("ab_props:image_max_edge_test_expo_key", C002701k.A01(sparseArray, 86), edit);
                        C002001d.A35("ab_props:status_image_max_edge_test_expo_key", C002701k.A01(sparseArray, 87), edit);
                        C002001d.A35("ab_props:image_compression_quality_test_expo_key", C002701k.A01(sparseArray, 88), edit);
                        C002001d.A35("ab_props:status_image_compression_quality_test_expo_key", C002701k.A01(sparseArray, 89), edit);
                        C002001d.A35("ab_props:image_quality_group_expo_key", C002701k.A01(sparseArray, 90), edit);
                        C002001d.A35("ab_props:stream_progressive_jpeg_enabled_expo_key", C002701k.A01(sparseArray, 97), edit);
                        C002001d.A35("ab_props:liger_enabled_expo_key", C002701k.A01(sparseArray, 98), edit);
                        C002001d.A35("ab_props:liger_quic_enabled_expo_key", C002701k.A01(sparseArray, 99), edit);
                        C002001d.A35("ab_props:mms4_pps_download_thumbnail_expo_key", C002701k.A01(sparseArray, 101), edit);
                        C002001d.A35("ab_props:mms4_pps_download_full_size_expo_key", C002701k.A01(sparseArray, 102), edit);
                        C002001d.A35("ab_props:pjeg_data_saver_enabled_expo_key", C002701k.A01(sparseArray, 103), edit);
                        C002001d.A35("ab_props:pjpeg_status_data_saver_enabled_expo_key", C002701k.A01(sparseArray, 109), edit);
                        C002001d.A35("ab_props:pjpeg_chat_data_saver_enabled_expo_key", C002701k.A01(sparseArray, 110), edit);
                        C002001d.A35("ab_props:download_full_pjpeg_max_edge_expo_key", C002701k.A01(sparseArray, 112), edit);
                        C002001d.A35("ab_props:download_full_pjpeg_max_edge_status_expo_key", C002701k.A01(sparseArray, 113), edit);
                        C002001d.A35("ab_props:higher_image_max_edge_expo_key", C002701k.A01(sparseArray, 114), edit);
                        C002001d.A35("ab_props:higher_image_max_edge_status_expo_key", C002701k.A01(sparseArray, 115), edit);
                        C002001d.A35("ab_props:image_max_kb_for_skipping_compression_expo_key", C002701k.A01(sparseArray, 126), edit);
                        C002001d.A35("ab_props:higher_image_quality_expo_key", C002701k.A01(sparseArray, 116), edit);
                        C002001d.A35("ab_props:higher_image_quality_status_expo_key", C002701k.A01(sparseArray, 117), edit);
                        C002001d.A35("ab_props:new_wam_runtime_enabled_expo_key", C002701k.A01(sparseArray, 118), edit);
                        C002001d.A35("ab_props:new_wam_runtime_beaconing_expo_key", C002701k.A01(sparseArray, 119), edit);
                        C002001d.A35("ab_props:status_collapse_muted_expo_key", C002701k.A01(sparseArray, 120), edit);
                        C002001d.A35("ab_props:photo_upload_bandwidth_estimation_enabled_expo_key", C002701k.A01(sparseArray, 121), edit);
                        C002001d.A35("ab_props:photo_download_bandwidth_estimation_enabled_expo_key", C002701k.A01(sparseArray, 122), edit);
                        C002001d.A35("ab_props:pjpeg_force_download_mid_quality_enabled_expo_key", C002701k.A01(sparseArray, 123), edit);
                        C002001d.A35("ab_props:dns_over_https_enabled_expo_key", C002701k.A01(sparseArray, 124), edit);
                        C002001d.A35("ab_props:dns_over_https_interleave_enabled_expo_key", C002701k.A01(sparseArray, 133), edit);
                        C002001d.A35("ab_props:camera_core_integration_enabled_expo_key", C002701k.A01(sparseArray, 125), edit);
                        C002001d.A35("ab_props:bandwidth_estimation_algorithm_expo_key", C002701k.A01(sparseArray, 127), edit);
                        C002001d.A35("ab_props:bandwidth_estimation_adjacent_hours_optimization_expo_key", C002701k.A01(sparseArray, 154), edit);
                        C002001d.A35("ab_props:lazy_camera_view_inflation_expo_key", C002701k.A01(sparseArray, 128), edit);
                        C002001d.A35("ab_props:sender_higher_quality_bandwidth_threshold_expo_key", C002701k.A01(sparseArray, 129), edit);
                        C002001d.A35("ab_props:receiver_higher_quality_bandwidth_threshold_expo_key", C002701k.A01(sparseArray, 130), edit);
                        C002001d.A35("ab_props:photo_download_realtime_bandwidth_enabled_expo_key", C002701k.A01(sparseArray, 131), edit);
                        C002001d.A35("ab_props:wamsys_registration_enabled_expo_key", C002701k.A01(sparseArray, 132), edit);
                        C002001d.A35("ab_props:wamsys_registration_value_expo_key", C002701k.A01(sparseArray, 134), edit);
                        C002001d.A35("ab_props:wamsys_registration_v3_enabled_expo_key", C002701k.A01(sparseArray, 140), edit);
                        C002001d.A35("ab_props:wamsys_registration_v4_enabled_expo_key", C002701k.A01(sparseArray, 143), edit);
                        C002001d.A35("ab_props:wamsys_registration_v5_enabled_expo_key", C002701k.A01(sparseArray, 145), edit);
                        C002001d.A35("ab_props:wamsys_registration_v6_enabled_expo_key", C002701k.A01(sparseArray, 148), edit);
                        C002001d.A35("ab_props:mms_chatd_resume_check_override_expo_key", C002701k.A01(sparseArray, 136), edit);
                        C002001d.A35("ab_props:disable_status_autodownload_inactive_users_expo_key", C002701k.A01(sparseArray, 138), edit);
                        C002001d.A35("ab_props:auto_expo_int_field_expo_key", C002701k.A01(sparseArray, 142), edit);
                        C002001d.A35("ab_props:auto_expo_status_tab_open_expo_key", C002701k.A01(sparseArray, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT), edit);
                        C002001d.A35("ab_props:wamsys_mms_enabled_expo_key", C002701k.A01(sparseArray, 147), edit);
                        C002001d.A35("ab_props:mms_media_conn_persist_enabled_expo_key", C002701k.A01(sparseArray, 149), edit);
                        C002001d.A35("ab_props:mms_media_conn_foreground_only_enabled_expo_key", C002701k.A01(sparseArray, 150), edit);
                        C002001d.A35("ab_props:android_camera2_support_level_expo_key", C002701k.A01(sparseArray, 151), edit);
                        C002001d.A35("ab_props:connect_with_friends_dialog_enabled_expo_key", C002701k.A01(sparseArray, 152), edit);
                        C002001d.A35("ab_props:max_keys_expo_key", C002701k.A01(sparseArray, 156), edit);
                        C002001d.A35("ab_props:video_max_bitrate_expo_key", C002701k.A01(sparseArray, 157), edit);
                        C002001d.A35("ab_props:work_manager_hourly_cron_expo_key", C002701k.A01(sparseArray, 161), edit);
                        C002001d.A35("ab_props:work_manager_ntp_sync_expo_key", C002701k.A01(sparseArray, 170), edit);
                        C002001d.A35("ab_props:media_max_autodownload_wifi_mb_expo_key", C002701k.A01(sparseArray, 168), edit);
                        C002001d.A35("ab_props:media_max_autodownload_expo_key", C002701k.A01(sparseArray, 169), edit);
                        C002001d.A35("ab_props:status_video_max_duration_expo_key", C002701k.A01(sparseArray, 175), edit);
                        C002001d.A35("ab_props:voip_fix_converter_memory_leak_expo_key", C002701k.A01(sparseArray, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH), edit);
                        C002001d.A35("ab_props:enable_non_wake_up_alarm_ping_expo_key", C002701k.A01(sparseArray, 180), edit);
                        C002001d.A35("ab_props:async_init_after_thread_idle_expo_key", C002701k.A01(sparseArray, 181), edit);
                        C002001d.A35("ab_props:wamsys_decryption_individual_enabled_expo_key", C002701k.A01(sparseArray, 182), edit);
                        C002001d.A35("ab_props:wamsys_encryption_individual_enabled_expo_key", C002701k.A01(sparseArray, 187), edit);
                        C002001d.A35("ab_props:wamsys_decryption_group_enabled_expo_key", C002701k.A01(sparseArray, 188), edit);
                        C002001d.A35("ab_props:wamsys_encryption_group_enabled_expo_key", C002701k.A01(sparseArray, 189), edit);
                        C002001d.A35("ab_props:android_test_scheduler_api_expo_key", C002701k.A01(sparseArray, 183), edit);
                        C002001d.A35("ab_props:android_test_scheduler_period_impl_expo_key", C002701k.A01(sparseArray, 184), edit);
                        C002001d.A35("ab_props:android_test_scheduler_period_hours_expo_key", C002701k.A01(sparseArray, 185), edit);
                        C002001d.A35("ab_props:android_test_scheduler_run_seconds_expo_key", C002701k.A01(sparseArray, 186), edit);
                        C002001d.A35("ab_props:transsion_badging_expo_key", C002701k.A01(sparseArray, 190), edit);
                        C002001d.A35("ab_props:enable_hash_based_hybrid_codecs_mask_expo_key", C002701k.A01(sparseArray, 191), edit);
                        C002001d.A35("ab_props:upload_thread_lower_priority_expo_key", C002701k.A01(sparseArray, 192), edit);
                        C002001d.A35("ab_props:async_data_load_on_startup_expo_key", C002701k.A01(sparseArray, 196), edit);
                        C002001d.A35("ab_props:enable_long_running_job_monitor_expo_key", C002701k.A01(sparseArray, 281), edit);
                        C002001d.A35("ab_props:bloks_use_minscript_android_expo_key", C002701k.A01(sparseArray, 198), edit);
                        C002001d.A35("ab_props:load_chats_lazily_expo_key", C002701k.A01(sparseArray, 199), edit);
                        C002001d.A35("ab_props:status_ranking_expo_key", C002701k.A01(sparseArray, 56), edit);
                        C002001d.A35("ab_props:db_migration_low_latency_kill_switch_latency_expo_key", C002701k.A01(sparseArray, 200), edit);
                        C002001d.A35("ab_props:db_migration_low_latency_kill_switch_expo_key", C002701k.A01(sparseArray, 201), edit);
                        C002001d.A35("ab_props:db_migration_low_latency_kill_switch_experiment_expo_key", C002701k.A01(sparseArray, 203), edit);
                        C002001d.A35("ab_props:db_migration_data_source_v1_expo_key", C002701k.A01(sparseArray, 205), edit);
                        C002001d.A35("ab_props:db_migration_data_source_v2_expo_key", C002701k.A01(sparseArray, 206), edit);
                        C002001d.A35("ab_props:db_migration_level_reset_expo_key", C002701k.A01(sparseArray, 207), edit);
                        C002001d.A35("ab_props:db_migration_level_keep_expo_key", C002701k.A01(sparseArray, 208), edit);
                        C002001d.A35("ab_props:db_migration_level_migrate_expo_key", C002701k.A01(sparseArray, 209), edit);
                        C002001d.A35("ab_props:db_migration_level_force_expo_key", C002701k.A01(sparseArray, 242), edit);
                        C002001d.A35("ab_props:db_migration_max_db_size_expo_key", C002701k.A01(sparseArray, 261), edit);
                        C002001d.A35("ab_props:db_migration_release_failure_login_controls_expo_key", C002701k.A01(sparseArray, 262), edit);
                        C002001d.A35("ab_props:db_verification_controls_expo_key", C002701k.A01(sparseArray, 277), edit);
                        C002001d.A35("ab_props:shops_pdp_urls_config_expo_key", C002701k.A01(sparseArray, 210), edit);
                        C002001d.A35("ab_props:shops_storefront_native_entrypoint_enabled_expo_key", C002701k.A01(sparseArray, 267), edit);
                        C002001d.A35("ab_props:wallpapers_v2_expo_key", C002701k.A01(sparseArray, 211), edit);
                        C002001d.A35("ab_props:low_space_threshold_expo_key", C002701k.A01(sparseArray, 224), edit);
                        C002001d.A35("ab_props:video_transcode_retry_enabled_expo_key", C002701k.A01(sparseArray, 227), edit);
                        C002001d.A35("ab_props:video_transcode_fallback_enabled_expo_key", C002701k.A01(sparseArray, 228), edit);
                        C002001d.A35("ab_props:dedupe_transcode_images_expo_key", C002701k.A01(sparseArray, 229), edit);
                        C002001d.A35("ab_props:dedupe_transcode_videos_expo_key", C002701k.A01(sparseArray, 230), edit);
                        C002001d.A35("ab_props:dedupe_transcode_shared_images_expo_key", C002701k.A01(sparseArray, 263), edit);
                        C002001d.A35("ab_props:dedupe_transcode_shared_videos_expo_key", C002701k.A01(sparseArray, 264), edit);
                        C002001d.A35("ab_props:dedupe_transcode_gif_expo_key", C002701k.A01(sparseArray, 231), edit);
                        C002001d.A35("ab_props:dedupe_transcode_audio_expo_key", C002701k.A01(sparseArray, 232), edit);
                        C002001d.A35("ab_props:in_app_support_v2_enabled_expo_key", C002701k.A01(sparseArray, 233), edit);
                        C002001d.A35("ab_props:disable_new_sticker_animation_expo_key", C002701k.A01(sparseArray, 234), edit);
                        C002001d.A35("ab_props:enable_mmap_stringpacks_expo_key", C002701k.A01(sparseArray, 235), edit);
                        C002001d.A35("ab_props:new_sticker_animation_behavior_v2_expo_key", C002701k.A01(sparseArray, 237), edit);
                        C002001d.A35("ab_props:disable_privatestats_battery_expo_key", C002701k.A01(sparseArray, 238), edit);
                        C002001d.A35("ab_props:remove_geolocation_videos_expo_key", C002701k.A01(sparseArray, 239), edit);
                        C002001d.A35("ab_props:sticker_search_enabled_expo_key", C002701k.A01(sparseArray, 240), edit);
                        C002001d.A35("ab_props:enable_privatestats_expo_key", C002701k.A01(sparseArray, 241), edit);
                        C002001d.A35("ab_props:upload_status_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 246), edit);
                        C002001d.A35("ab_props:upload_document_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 247), edit);
                        C002001d.A35("ab_props:upload_link_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 248), edit);
                        C002001d.A35("ab_props:download_status_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 249), edit);
                        C002001d.A35("ab_props:download_document_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 250), edit);
                        C002001d.A35("ab_props:download_link_thumb_mms_enabled_expo_key", C002701k.A01(sparseArray, 251), edit);
                        C002001d.A35("ab_props:send_status_thumb_in_message_disabled_expo_key", C002701k.A01(sparseArray, 252), edit);
                        C002001d.A35("ab_props:send_document_thumb_in_message_disabled_expo_key", C002701k.A01(sparseArray, 253), edit);
                        C002001d.A35("ab_props:send_link_thumb_in_message_disabled_expo_key", C002701k.A01(sparseArray, 254), edit);
                        C002001d.A35("ab_props:animated_stickers_thread_clean_up_expo_key", C002701k.A01(sparseArray, 255), edit);
                        C002001d.A35("ab_props:media_upload_aggressive_retry_enabled_expo_key", C002701k.A01(sparseArray, 256), edit);
                        C002001d.A35("ab_props:media_upload_aggressive_retry_exponential_backoff_enabled_expo_key", C002701k.A01(sparseArray, 257), edit);
                        C002001d.A35("ab_props:media_upload_max_aggressive_retries_expo_key", C002701k.A01(sparseArray, 258), edit);
                        C002001d.A35("ab_props:pen_smoothing_enabled_expo_key", C002701k.A01(sparseArray, 274), edit);
                        C002001d.A35("ab_props:status_grid_enabled_expo_key", C002701k.A01(sparseArray, 278), edit);
                        C002001d.A35("ab_props:pencil_ui_enhancements_wave_1_enabled_expo_key", C002701k.A01(sparseArray, 279), edit);
                        C002001d.A35("ab_props:enable_catalogs_carts_expo_key", C002701k.A01(sparseArray, 259), edit);
                        C002001d.A35("ab_props:shops_storefront_urls_config_expo_key", C002701k.A01(sparseArray, 265), edit);
                        C002001d.A35("ab_props:app_locked_with_biometrics_expo_key", C002701k.A01(sparseArray, 266), edit);
                        C002001d.A35("ab_props:android_media_use_fresco_for_gifs_expo_key", C002701k.A01(sparseArray, 270), edit);
                        C002001d.A35("ab_props:sticker_tray_animation_finite_loops_expo_key", C002701k.A01(sparseArray, 271), edit);
                        C002001d.A35("ab_props:sticker_tray_animation_first_row_expo_key", C002701k.A01(sparseArray, 272), edit);
                        C002001d.A35("ab_props:sticker_tray_animation_fully_visible_items_expo_key", C002701k.A01(sparseArray, 273), edit);
                        C002001d.A35("ab_props:sticker_picker_animated_sticker_shrinking_expo_key", C002701k.A01(sparseArray, 276), edit);
                        C002001d.A35("ab_props:android_push_notify_fg_service_expo_key", C002701k.A01(sparseArray, 280), edit);
                        C002001d.A35("ab_props:group_chat_message_push_priority_obfuscation_percent_expo_key", C002701k.A01(sparseArray, 282), edit);
                        C002001d.A35("ab_props:android_push_config_muted_chats_expo_key", C002701k.A01(sparseArray, 283), edit);
                        C002001d.A35("ab_props:third_party_animated_sticker_import_expo_key", C002701k.A01(sparseArray, 290), edit);
                        C002001d.A35("ab_props:sticker_contextual_suggestion_enabled_expo_key", C002701k.A01(sparseArray, 291), edit);
                        C002001d.A35("ab_props:disable_third_party_animated_sticker_animation_expo_key", C002701k.A01(sparseArray, 295), edit);
                        C002001d.A35("ab_props:yt_video_preview_expo_key", C002701k.A01(sparseArray, 314), edit);
                        C002001d.A35("ab_props:android_us_language_selector_expo_key", C002701k.A01(sparseArray, 292), edit);
                        C002001d.A35("ab_props:stanza_processing_logging_enabled_expo_key", C002701k.A01(sparseArray, 296), edit);
                        C002001d.A35("ab_props:privatestats_upload_jitter_secs_expo_key", C002701k.A01(sparseArray, 305), edit);
                        C002001d.A35("ab_props:payments_bloks_rendercore_enabled_expo_key", C002701k.A01(sparseArray, 307), edit);
                        C002001d.A35("ab_props:groups_dogfooding_ui_expo_key", C002701k.A01(sparseArray, 308), edit);
                        C002001d.A35("ab_props:md_icdc_enabled_expo_key", C002701k.A01(sparseArray, 309), edit);
                        C002001d.A35("ab_props:md_icdc_hash_length_expo_key", C002701k.A01(sparseArray, 310), edit);
                        C002001d.A35("ab_props:disable_buttons_message_expo_key", C002701k.A01(sparseArray, 316), edit);
                        C002001d.A35("ab_props:mute_video_expo_key", C002701k.A01(sparseArray, 325), edit);
                        C002001d.A35("ab_props:new_user_location_dialogs_enabled_expo_key", C002701k.A01(sparseArray, 332), edit);
                        C002001d.A35("ab_props:use_compressed_packfile_expo_key", C002701k.A01(sparseArray, 334), edit);
                        C002001d.A35("ab_props:new_business_profile_info_view_enabled_expo_key", C002701k.A01(sparseArray, 37), edit);
                        C002001d.A35("ab_props:smb_profile_banner_new_copy_enabled_expo_key", C002701k.A01(sparseArray, 158), edit);
                        C002001d.A35("ab_props:smb_profile_banner_prioritized_enabled_expo_key", C002701k.A01(sparseArray, 159), edit);
                        C002001d.A35("ab_props:smb_banner_max_display_days_expo_key", C002701k.A01(sparseArray, 163), edit);
                        C002001d.A35("ab_props:smb_banner_max_click_count_expo_key", C002701k.A01(sparseArray, 164), edit);
                        C002001d.A35("ab_props:smb_banner_max_dismiss_count_expo_key", C002701k.A01(sparseArray, 165), edit);
                        C002001d.A35("ab_props:smb_banner_display_days_consec_expo_key", C002701k.A01(sparseArray, 166), edit);
                        C002001d.A35("ab_props:smb_days_between_banner_expo_key", C002701k.A01(sparseArray, 167), edit);
                        C002001d.A35("ab_props:edit_business_profile_new_mode_enabled_expo_key", C002701k.A01(sparseArray, 297), edit);
                        C002001d.A35("ab_props:smb_better_catalog_upload_enabled_expo_key", C002701k.A01(sparseArray, 306), edit);
                        C002001d.A35("ab_props:qpl_enabled_expo_key", C002701k.A01(sparseArray, 212), edit);
                        C002001d.A35("ab_props:qpl_max_file_size_expo_key", C002701k.A01(sparseArray, 213), edit);
                        C002001d.A35("ab_props:qpl_max_file_count_expo_key", C002701k.A01(sparseArray, 214), edit);
                        C002001d.A35("ab_props:qpl_upload_delay_expo_key", C002701k.A01(sparseArray, 215), edit);
                        C002001d.A35("ab_props:qpl_seed_expo_key", C002701k.A01(sparseArray, 225), edit);
                        C002001d.A35("ab_props:qpl_sampling_expo_key", C002701k.A01(sparseArray, 226), edit);
                        C002001d.A35("ab_props:stop_abprops_traffic_in_serverprops_response_expo_key", C002701k.A01(sparseArray, 315), edit);
                        C002001d.A35("ab_props:abprops_beta_pull_frequency_expo_key", C002701k.A01(sparseArray, 327), edit);
                        Set<String> stringSet = sharedPreferences2.getStringSet("ab_props:sys:last_exposure_keys", null);
                        if (stringSet == null) {
                            r2 = new AnonymousClass03V(0);
                        } else {
                            r2 = new AnonymousClass03V(0);
                            r2.addAll(stringSet);
                        }
                        AnonymousClass03V r6 = new AnonymousClass03V(0);
                        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                            Pair pair = (Pair) sparseArray.valueAt(i5);
                            if (pair == null) {
                                str = null;
                            } else {
                                str = (String) pair.second;
                            }
                            if (r2.contains(str)) {
                                r6.add(str);
                            }
                        }
                        r102.A0C(edit, r6);
                    }
                    edit.putString("ab_props:sys:config_key", A0G2);
                    AnonymousClass038 r3 = r102.A0L;
                    r3.A03(4473, A0G2, 0);
                    r3.A03(4473, A0G2, 1);
                    if (!TextUtils.isEmpty(A0G3)) {
                        edit.putString("ab_props:sys:config_hash", A0G3);
                    }
                    edit.apply();
                    edit.putLong("ab_props:sys:last_refresh_time", r22.A05());
                    edit.apply();
                }
                r102.A0B(0);
                r102.A0A(0);
                if (!TextUtils.isEmpty(A0G3)) {
                    SharedPreferences.Editor edit2 = this.A0E.A00.edit();
                    edit2.clear();
                    for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                        int keyAt = sparseIntArray.keyAt(i6);
                        edit2.putInt(String.valueOf(keyAt), sparseIntArray.valueAt(i6));
                    }
                    edit2.apply();
                }
                return true;
            } else if (i == 214) {
                AnonymousClass0AR r02 = this.A0G;
                r02.A03();
                r02.A0M((AnonymousClass1XX) ((Bundle) message.obj).getParcelable("stanzaKey"));
                return true;
            } else if (i == 13) {
                Bundle bundle2 = (Bundle) message.obj;
                String string4 = bundle2.getString("msgId");
                long j3 = bundle2.getLong("timestamp");
                String string5 = bundle2.getString("status");
                AnonymousClass0EW r23 = this.A01;
                r23.A00.post(new RunnableC64082xb(this, (UserJid) bundle2.getParcelable("jid"), j3, string5, string4));
                return true;
            } else if (i != 14) {
                return false;
            } else {
                Bundle bundle3 = (Bundle) message.obj;
                String string6 = bundle3.getString("msgId");
                Parcelable parcelable = bundle3.getParcelable("jid");
                AnonymousClass0EW r4 = this.A01;
                r4.A00.post(new RunnableEBaseShape0S1200000_I0(this, parcelable, string6, 17));
                return true;
            }
        } else {
            AnonymousClass0M5 r42 = (AnonymousClass0M5) message.obj;
            int A022 = C006803i.A02(r42.A0G("version", null), 0);
            int A023 = C006803i.A02(r42.A0G("protocol", null), 1);
            HashMap hashMap = new HashMap();
            for (AnonymousClass0M5 r62 : r42.A0H("prop")) {
                hashMap.put(r62.A0F("name"), r62.A0G("value", null));
            }
            if (A023 == 2) {
                this.A05.A0B(this.A0A, this.A07, A022, hashMap, A023, r42.A0G("hash", null), r42.A0G("key", null), C006803i.A04(r42.A0G("refresh", null), 86400) * 1000);
            } else {
                this.A05.A0B(this.A0A, this.A07, A022, hashMap, 1, null, null, 86400000);
            }
            this.A0I.ANF(new RunnableEBaseShape3S0100000_I0_3(this, 42));
            return true;
        }
    }
}
