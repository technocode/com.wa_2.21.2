package X;

/* renamed from: X.348  reason: invalid class name */
public class AnonymousClass348 {
    public final AnonymousClass00S A00;
    public final C73193Vv A01;

    public AnonymousClass348(AnonymousClass00S r1, C73193Vv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass34A A00() {
        AnonymousClass349 r2 = new AnonymousClass349();
        if (A01("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME")) {
            r2.A04 = this.A01.A0A("STORAGE_USAGE_MEDIA_SIZE");
        }
        if (A01("STORAGE_USAGE_LARGE_FILES_CACHE_TIME")) {
            C73193Vv r1 = this.A01;
            r2.A03 = r1.A0A("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE");
            r2.A01 = r1.A09("STORAGE_USAGE_LARGE_FILES_COUNT");
            r2.A06 = r1.A0C("STORAGE_USAGE_LARGE_FILES_ROW_IDS");
        }
        if (A01("STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME")) {
            C73193Vv r12 = this.A01;
            r2.A02 = r12.A0A("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE");
            r2.A00 = r12.A09("STORAGE_USAGE_FORWARDED_FILES_COUNT");
            r2.A05 = r12.A0C("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS");
        }
        return new AnonymousClass34A(r2);
    }

    public final boolean A01(String str) {
        Long A0A = this.A01.A0A(str);
        return A0A != null && this.A00.A05() - A0A.longValue() <= 2592000000L;
    }
}
