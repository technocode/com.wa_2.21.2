package X;

import com.whatsapp.util.Log;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.0Ip  reason: invalid class name and case insensitive filesystem */
public class C04000Ip implements Comparator {
    public HashMap A00;
    public final AbstractC03980In[] A01;

    public C04000Ip(AbstractC03980In[] r1) {
        this.A01 = r1;
    }

    public final int A00(C03960Il r3) {
        if (A01().containsKey(r3)) {
            return ((Number) A01().get(r3)).intValue();
        }
        StringBuilder A0S = AnonymousClass008.A0S("EmojiPickerComparator/found an emoji that doesn't exist in emoji picker ");
        A0S.append(r3.toString());
        Log.e(A0S.toString());
        return 0;
    }

    public final synchronized HashMap A01() {
        HashMap hashMap;
        hashMap = this.A00;
        if (hashMap == null) {
            hashMap = new HashMap();
            int i = 0;
            for (AbstractC03980In r0 : this.A01) {
                for (int[] iArr : ((EnumC03970Im) r0).emojiData) {
                    hashMap.put(new C03960Il(iArr), Integer.valueOf(i));
                    i++;
                }
            }
            AnonymousClass008.A0t("EmojiPickerComparator/createEmojiPickerRanking/total emojis:", i);
            this.A00 = hashMap;
        }
        return hashMap;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return A00((C03960Il) obj) - A00((C03960Il) obj2);
    }
}
