package com.whatsapp;

import X.AnonymousClass2QD;
import java.io.Serializable;
import java.util.Arrays;

public class EmojiPicker$EmojiWeight implements AnonymousClass2QD, Serializable {
    public static final long serialVersionUID = 1;
    public int code;
    public int[] emoji;
    public int modifier;
    public float weight;

    public EmojiPicker$EmojiWeight(int[] iArr, float f) {
        this.emoji = iArr;
        this.weight = f;
    }

    @Override // X.AnonymousClass2QD
    public boolean A2r(Object obj) {
        return Arrays.equals(this.emoji, (int[]) obj);
    }

    @Override // X.AnonymousClass2QD
    public Object A6a() {
        return this.emoji;
    }

    @Override // X.AnonymousClass2QD
    public float A9r() {
        return this.weight;
    }

    @Override // X.AnonymousClass2QD
    public void APN(float f) {
        this.weight = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EmojiPicker$EmojiWeight.class != obj.getClass()) {
            return false;
        }
        EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) obj;
        if (Float.compare(emojiPicker$EmojiWeight.weight, this.weight) != 0 || !Arrays.equals(this.emoji, emojiPicker$EmojiWeight.emoji)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.emoji) + (Float.valueOf(this.weight).hashCode() * 31 * 31);
    }
}
