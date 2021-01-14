package X;

import android.util.Base64;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.18a  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC239018a {
    public static Object A00(C35381kF r3, Object obj) {
        AnonymousClass18Z r32 = r3.A00;
        if (r32 == null) {
            return obj;
        }
        C35361kD r33 = (C35361kD) r32;
        if (r33 != null) {
            Object obj2 = r33.A01.get(((Number) obj).intValue());
            return (obj2 != null || !r33.A02.containsKey("gms_unknown")) ? obj2 : "gms_unknown";
        }
        throw null;
    }

    public static void A01(StringBuilder sb, C35381kF r3, Object obj) {
        int i = r3.A03;
        if (i == 11) {
            sb.append(r3.A06.cast(obj).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(C240118m.A00((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    public Object A02(C35381kF r8) {
        if (this instanceof AnonymousClass294) {
            AnonymousClass294 r1 = (AnonymousClass294) this;
            int i = r8.A05;
            if (i == 1) {
                return Integer.valueOf(r1.A05);
            }
            if (i == 2) {
                return r1.A03;
            }
            if (i == 3) {
                return Integer.valueOf(r1.A00);
            }
            if (i == 4) {
                return r1.A04;
            }
            throw new IllegalStateException(AnonymousClass008.A08(37, "Unknown SafeParcelable id=", i));
        } else if (this instanceof AnonymousClass293) {
            AnonymousClass293 r12 = (AnonymousClass293) this;
            int i2 = r8.A05;
            if (i2 == 1) {
                return Integer.valueOf(r12.A04);
            }
            if (i2 == 2) {
                return r12.A00;
            }
            if (i2 == 3) {
                return r12.A02;
            }
            if (i2 == 4) {
                return r12.A01;
            }
            throw new IllegalStateException(AnonymousClass008.A08(37, "Unknown SafeParcelable id=", i2));
        } else if (this instanceof AnonymousClass292) {
            AnonymousClass292 r0 = (AnonymousClass292) this;
            int i3 = r8.A05;
            switch (i3) {
                case 1:
                    return Integer.valueOf(r0.A05);
                case 2:
                    return r0.A00;
                case 3:
                    return r0.A01;
                case 4:
                    return r0.A02;
                case 5:
                    return r0.A03;
                case 6:
                    return r0.A04;
                default:
                    throw new IllegalStateException(AnonymousClass008.A08(37, "Unknown SafeParcelable id=", i3));
            }
        } else if (!(this instanceof AnonymousClass291)) {
            String str = r8.A07;
            boolean z = ((AbstractC35391kG) this) instanceof AnonymousClass26C;
            if (r8.A06 != null) {
                if (!z) {
                    boolean z2 = false;
                    if (0 == 0) {
                        z2 = true;
                    }
                    C001801b.A1d(z2, "Concrete field shouldn't be value object: %s", str);
                    try {
                        char upperCase = Character.toUpperCase(str.charAt(0));
                        String substring = str.substring(1);
                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                        sb.append("get");
                        sb.append(upperCase);
                        sb.append(substring);
                        return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
                }
            } else if (!z) {
                return null;
            } else {
                throw new UnsupportedOperationException("Converting to JSON does not require this method.");
            }
        } else {
            AnonymousClass291 r13 = (AnonymousClass291) this;
            int i4 = r8.A05;
            if (i4 == 1) {
                return Integer.valueOf(r13.A03);
            }
            if (i4 == 2) {
                return r13.A02;
            }
            if (i4 == 4) {
                return r13.A01;
            }
            throw new IllegalStateException(AnonymousClass008.A08(37, "Unknown SafeParcelable id=", i4));
        }
    }

    public Map A03() {
        if (this instanceof AnonymousClass26C) {
            AnonymousClass26C r1 = (AnonymousClass26C) this;
            C35401kH r0 = r1.A05;
            if (r0 == null) {
                return null;
            }
            return (Map) r0.A02.get(r1.A06);
        } else if (this instanceof AnonymousClass294) {
            return AnonymousClass294.A07;
        } else {
            if (this instanceof AnonymousClass293) {
                return AnonymousClass293.A06;
            }
            if (!(this instanceof AnonymousClass292)) {
                return AnonymousClass291.A05;
            }
            return AnonymousClass292.A06;
        }
    }

    public boolean A04(C35381kF r3) {
        if (this instanceof AnonymousClass294) {
            return ((AnonymousClass294) this).A06.contains(Integer.valueOf(r3.A05));
        }
        if (this instanceof AnonymousClass293) {
            return ((AnonymousClass293) this).A05.contains(Integer.valueOf(r3.A05));
        }
        if (this instanceof AnonymousClass292) {
            return true;
        }
        if (this instanceof AnonymousClass291) {
            return ((AnonymousClass291) this).A04.contains(Integer.valueOf(r3.A05));
        }
        if (r3.A04 == 11) {
            if (r3.A0A) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        } else if (!(((AbstractC35391kG) this) instanceof AnonymousClass26C)) {
            return false;
        } else {
            throw new UnsupportedOperationException("Converting to JSON does not require this method.");
        }
    }

    public String toString() {
        String encodeToString;
        String encodeToString2;
        Map A03 = A03();
        StringBuilder sb = new StringBuilder(100);
        for (String str : A03.keySet()) {
            C35381kF r7 = (C35381kF) A03.get(str);
            if (A04(r7)) {
                Object A00 = A00(r7, A02(r7));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (A00 != null) {
                    switch (r7.A04) {
                        case 8:
                            sb.append("\"");
                            byte[] bArr = (byte[]) A00;
                            if (bArr == null) {
                                encodeToString2 = null;
                            } else {
                                encodeToString2 = Base64.encodeToString(bArr, 0);
                            }
                            sb.append(encodeToString2);
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            byte[] bArr2 = (byte[]) A00;
                            if (bArr2 == null) {
                                encodeToString = null;
                            } else {
                                encodeToString = Base64.encodeToString(bArr2, 10);
                            }
                            sb.append(encodeToString);
                            sb.append("\"");
                            continue;
                        case 10:
                            C008805h.A1H(sb, (HashMap) A00);
                            continue;
                        default:
                            if (!r7.A09) {
                                A01(sb, r7, A00);
                                break;
                            } else {
                                AbstractList abstractList = (AbstractList) A00;
                                sb.append("[");
                                int size = abstractList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = abstractList.get(i);
                                    if (obj != null) {
                                        A01(sb, r7, obj);
                                    }
                                }
                                sb.append("]");
                                continue;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
