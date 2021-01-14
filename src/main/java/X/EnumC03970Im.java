package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.0Im  reason: invalid class name and case insensitive filesystem */
public enum EnumC03970Im implements AbstractC03980In {
    PEOPLE(C03990Io.A05, R.id.emoji_people_btn, R.id.emoji_people_marker, R.string.emoji_label_people),
    NATURE(C03990Io.A03, R.id.emoji_nature_btn, R.id.emoji_nature_marker, R.string.emoji_label_nature),
    FOOD(C03990Io.A02, R.id.emoji_food_btn, R.id.emoji_food_marker, R.string.emoji_label_food),
    ACTIVITY(C03990Io.A00, R.id.emoji_activity_btn, R.id.emoji_activity_marker, R.string.emoji_label_activity),
    TRAVEL(C03990Io.A07, R.id.emoji_travel_btn, R.id.emoji_travel_marker, R.string.emoji_label_travel),
    OBJECTS(C03990Io.A04, R.id.emoji_objects_btn, R.id.emoji_objects_marker, R.string.emoji_label_objects),
    SYMBOLS(C03990Io.A06, R.id.emoji_symbols_btn, R.id.emoji_symbols_marker, R.string.emoji_label_symbols),
    FLAGS(C03990Io.A01, R.id.emoji_flags_btn, R.id.emoji_flags_marker, R.string.emoji_label_flags);
    
    public final int buttonId;
    public final int[][] emojiData;
    public final int markerId;
    public final int titleResId;

    /* access modifiers changed from: public */
    EnumC03970Im(int[][] iArr, int i, int i2, int i3) {
        this.emojiData = iArr;
        this.buttonId = i;
        this.markerId = i2;
        this.titleResId = i3;
    }
}
