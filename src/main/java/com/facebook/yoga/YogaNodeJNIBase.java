package com.facebook.yoga;

import X.AbstractC223811h;
import X.AbstractC224011k;
import X.AnonymousClass008;
import X.EnumC223511c;
import X.EnumC223711e;
import X.EnumC223911i;
import java.util.ArrayList;
import java.util.List;

public abstract class YogaNodeJNIBase extends AbstractC224011k implements Cloneable {
    public float[] arr = null;
    public List mChildren;
    public Object mData;
    public int mLayoutDirection = 0;
    public AbstractC223811h mMeasureFunction;
    public long mNativePointer;
    public YogaNodeJNIBase mOwner;

    public YogaNodeJNIBase(long j) {
        if (j != 0) {
            this.mNativePointer = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @Override // X.AbstractC224011k
    public void addChildAt(AbstractC224011k r5, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r5;
        if (yogaNodeJNIBase.mOwner == null) {
            List list = this.mChildren;
            if (list == null) {
                list = new ArrayList(4);
                this.mChildren = list;
            }
            list.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    @Override // X.AbstractC224011k
    public void calculateLayout(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List list = ((YogaNodeJNIBase) arrayList.get(i)).mChildren;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        int length = yogaNodeJNIBaseArr.length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].mNativePointer;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.mNativePointer, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    public YogaNodeJNIBase cloneWithChildren() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeCloneJNI;
            for (int i = 0; i < yogaNodeJNIBase.getChildCount(); i++) {
                List list = yogaNodeJNIBase.mChildren;
                if (list != null) {
                    YogaNodeJNIBase cloneWithChildren = ((YogaNodeJNIBase) list.get(i)).cloneWithChildren();
                    yogaNodeJNIBase.mChildren.remove(i);
                    yogaNodeJNIBase.mChildren.add(i, cloneWithChildren);
                    cloneWithChildren.mOwner = yogaNodeJNIBase;
                    YogaNative.jni_YGNodeSwapChildJNI(yogaNodeJNIBase.mNativePointer, cloneWithChildren.mNativePointer, i);
                } else {
                    throw new IllegalStateException("YogaNode does not have children");
                }
            }
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.AbstractC224011k
    public AbstractC224011k getChildAt(int i) {
        List list = this.mChildren;
        if (list != null) {
            return (AbstractC224011k) list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @Override // X.AbstractC224011k
    public int getChildCount() {
        List list = this.mChildren;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC224011k
    public EnumC223511c getLayoutDirection() {
        int i;
        float[] fArr = this.arr;
        if (fArr != null) {
            i = (int) fArr[5];
        } else {
            i = this.mLayoutDirection;
        }
        if (i == 0) {
            return EnumC223511c.INHERIT;
        }
        if (i == 1) {
            return EnumC223511c.LTR;
        }
        if (i == 2) {
            return EnumC223511c.RTL;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", i));
    }

    @Override // X.AbstractC224011k
    public float getLayoutHeight() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // X.AbstractC224011k
    public float getLayoutPadding(EnumC223711e r8) {
        EnumC223511c r6 = EnumC223511c.RTL;
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = 0;
        int i2 = (int) fArr[0];
        if ((i2 & 2) != 2) {
            return 0.0f;
        }
        if ((i2 & 1) != 1) {
            i = 4;
        }
        int i3 = 10 - i;
        int ordinal = r8.ordinal();
        if (ordinal == 0) {
            return fArr[i3];
        }
        if (ordinal == 1) {
            return fArr[i3 + 1];
        }
        if (ordinal == 2) {
            return fArr[i3 + 2];
        }
        if (ordinal == 3) {
            return fArr[i3 + 3];
        }
        if (ordinal == 4) {
            return getLayoutDirection() == r6 ? fArr[i3 + 2] : fArr[i3];
        }
        if (ordinal == 5) {
            return getLayoutDirection() == r6 ? fArr[i3] : fArr[i3 + 2];
        }
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
    }

    @Override // X.AbstractC224011k
    public float getLayoutWidth() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // X.AbstractC224011k
    public float getLayoutX() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // X.AbstractC224011k
    public float getLayoutY() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    public final long measure(float f, int i, float f2, int i2) {
        EnumC223911i r4;
        EnumC223911i r6;
        AbstractC223811h r1 = this.mMeasureFunction;
        if (r1 != null) {
            if (i == 0) {
                r4 = EnumC223911i.UNDEFINED;
            } else if (i == 1) {
                r4 = EnumC223911i.EXACTLY;
            } else if (i == 2) {
                r4 = EnumC223911i.AT_MOST;
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", i));
            }
            if (i2 == 0) {
                r6 = EnumC223911i.UNDEFINED;
            } else if (i2 == 1) {
                r6 = EnumC223911i.EXACTLY;
            } else if (i2 == 2) {
                r6 = EnumC223911i.AT_MOST;
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", i2));
            }
            return r1.AC8(this, f, r4, f2, r6);
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.mChildren;
        if (list != null) {
            list.remove(i);
            this.mChildren.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.mOwner = this;
            return yogaNodeJNIBase.mNativePointer;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // X.AbstractC224011k
    public void setMeasureFunction(AbstractC223811h r4) {
        this.mMeasureFunction = r4;
        long j = this.mNativePointer;
        boolean z = false;
        if (r4 != null) {
            z = true;
        }
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(j, z);
    }
}
