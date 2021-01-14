package X;

import java.util.Random;

/* renamed from: X.0vD  reason: invalid class name and case insensitive filesystem */
public class C19550vD {
    public static final C19550vD A07 = new C19550vD("oxygen_map_bitmap_reuse_error", true);
    public static final C19550vD A08 = new C19550vD("oxygen_map_config_fetch_error", true);
    public static final C19550vD A09 = new C19550vD("oxygen_map_disk_cache_init_error", true);
    public static final C19550vD A0A = new C19550vD("oxygen_map_disk_cache_null_key_error", true);
    public static final C19550vD A0B = new C19550vD("oxygen_map_disk_cache_read_error", true);
    public static final C19550vD A0C = new C19550vD("oxygen_map_disk_cache_write_error", true);
    public static final C19550vD A0D;
    public static final C19550vD A0E = new C19550vD("oxygen_map_dynamic_map_cold_tti_ns", false);
    public static final C19550vD A0F = new C19550vD("oxygen_map_dynamic_map_stats_per_impression", false);
    public static final C19550vD A0G = new C19550vD("oxygen_map_dynamic_map_view_impression", false);
    public static final C19550vD A0H = new C19550vD("oxygen_map_dynamic_map_warm_tti_ns", false);
    public static final C19550vD A0I = new C19550vD("oxygen_map_empty_cluster_error", true);
    public static final C19550vD A0J;
    public static final C19550vD A0K;
    public static final C19550vD A0L = new C19550vD("oxygen_map_tile_overlay_draw_time_ns", false);
    public static final C19550vD A0M;
    public static final C19550vD A0N;
    public static final C19550vD A0O = new C19550vD("oxygen_map_runtime_permission_error", true);
    public static final C19550vD A0P = new C19550vD("oxygen_map_suppressed_drain_to_byte_array_error", true);
    public static final C19550vD A0Q = new C19550vD("oxygen_map_tile_download_error", true);
    public static final C19550vD A0R;
    public static final C19550vD A0S;
    public static final C19550vD A0T = new C19550vD("oxygen_map_touch_event_time_ns", false);
    public static final C19550vD A0U;
    public static final Random A0V = new Random();
    public static final C19550vD[] A0W;
    public int A00 = 0;
    public long A01 = Long.MIN_VALUE;
    public long A02 = Long.MAX_VALUE;
    public long A03 = 0;
    public long[] A04;
    public final String A05;
    public final boolean A06;

    static {
        C19550vD r11 = new C19550vD("oxygen_map_draw_time_ns", false);
        A0D = r11;
        C19550vD r10 = new C19550vD("oxygen_map_layout_time_ns", false);
        A0K = r10;
        C19550vD r9 = new C19550vD("oxygen_map_tile_download_time_ns", true);
        A0S = r9;
        C19550vD r8 = new C19550vD("oxygen_map_tile_download_size", true);
        A0R = r8;
        C19550vD r7 = new C19550vD("oxygen_map_tree_compaction_time", true);
        A0U = r7;
        C19550vD r6 = new C19550vD("oxygen_map_marker_draw_time", false);
        A0M = r6;
        C19550vD r5 = new C19550vD("oxygen_map_marker_touch_detection_time", false);
        A0N = r5;
        C19550vD r4 = new C19550vD("oxygen_map_info_window_draw_time", false);
        A0J = r4;
        A0W = new C19550vD[]{r11, r10, r9, r8, r7, r6, r5, r4};
    }

    public C19550vD(String str, boolean z) {
        this.A05 = str;
        this.A06 = z;
    }

    public void A00() {
        if (this.A06) {
            synchronized (this) {
            }
        }
    }

    public void A01() {
        if (this.A06) {
            synchronized (this) {
            }
        }
    }

    public void A02() {
        if (this.A06) {
            synchronized (this) {
                this.A01 = Long.MIN_VALUE;
                this.A02 = Long.MAX_VALUE;
                this.A03 = 0;
                this.A00 = 0;
            }
            return;
        }
        this.A01 = Long.MIN_VALUE;
        this.A02 = Long.MAX_VALUE;
        this.A03 = 0;
        this.A00 = 0;
    }

    public void A03(long j) {
        if (this.A06) {
            synchronized (this) {
                A04(j);
            }
            return;
        }
        A04(j);
    }

    public final void A04(long j) {
        long[] jArr = this.A04;
        if (jArr == null) {
            jArr = new long[256];
            this.A04 = jArr;
        }
        long j2 = this.A01;
        if (j2 <= j) {
            j2 = j;
        }
        this.A01 = j2;
        long j3 = this.A02;
        if (j3 >= j) {
            j3 = j;
        }
        this.A02 = j3;
        this.A03 += j;
        int i = this.A00;
        if (i < 256) {
            jArr[i] = j;
        } else {
            int nextInt = A0V.nextInt(i + 1);
            if (nextInt < 256) {
                jArr[nextInt] = j;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 == 256) {
            A02();
        }
    }
}
