package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.2Mq  reason: invalid class name and case insensitive filesystem */
public enum EnumC48532Mq {
    CONTENT_STICKERS(C48542Mr.A00, R.string.shape_picker_section_content_stickers),
    SHAPES(C48542Mr.A01, R.string.shape_picker_section_shapes),
    PEOPLE(C48542Mr.A06, R.string.emoji_label_people),
    NATURE(C48542Mr.A04, R.string.emoji_label_nature),
    FOOD(C48542Mr.A03, R.string.emoji_label_food),
    ACTIVITY(C48542Mr.A02, R.string.emoji_label_activity),
    SYMBOLS(C48542Mr.A07, R.string.emoji_label_symbols),
    OBJECTS(C48542Mr.A05, R.string.emoji_label_objects);
    
    public final int sectionResId;
    public final AbstractC48432Mf[] shapeData;

    /* access modifiers changed from: public */
    EnumC48532Mq(AbstractC48432Mf[] r3, int i) {
        this.shapeData = r3;
        this.sectionResId = i;
    }
}
