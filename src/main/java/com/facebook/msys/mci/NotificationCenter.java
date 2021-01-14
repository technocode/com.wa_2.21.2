package com.facebook.msys.mci;

import X.AnonymousClass008;
import X.C20900xe;
import X.C32981g0;
import X.C32991g1;
import com.facebook.msys.util.McfReferenceHolder;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NotificationCenter {
    public static final String TAG = "NotificationCenter";
    public final Set mMainConfig = new HashSet();
    public final NativeHolder mNativeHolder = initNativeHolder();
    public final Map mNativeScopeToJavaScope = new HashMap();
    public final Map mObserverConfigs = new HashMap();

    public interface NotificationCallback {
        void onNewNotification(String str, Object obj, Map map);
    }

    private native void addObserverNative(String str);

    private native NativeHolder initNativeHolder();

    private native void removeObserverNative(String str);

    public synchronized void addObserver(NotificationCallback notificationCallback, String str, Object obj) {
        if (notificationCallback == null) {
            throw null;
        } else if (str == null) {
            throw null;
        } else if (!observerHasConfig(notificationCallback, str, obj)) {
            if (obj != null) {
                addScopeToMappingOfNativeToJava(obj);
            }
            addObserverConfig(notificationCallback, str, obj);
            if (this.mMainConfig.add(str)) {
                addObserverNative(str);
            }
        }
    }

    private boolean addObserverConfig(NotificationCallback notificationCallback, String str, Object obj) {
        C20900xe r2 = (C20900xe) this.mObserverConfigs.get(notificationCallback);
        if (r2 == null) {
            r2 = new C20900xe();
            this.mObserverConfigs.put(notificationCallback, r2);
        }
        if (obj == null) {
            return r2.A01.add(str);
        }
        Set set = (Set) r2.A00.get(obj);
        if (set == null) {
            set = new HashSet();
            r2.A00.put(obj, set);
        }
        return set.add(str);
    }

    private void addScopeToMappingOfNativeToJava(Object obj) {
        Long extractNativePointerFromMcfReference = extractNativePointerFromMcfReference(obj);
        if (extractNativePointerFromMcfReference == null) {
            throwInvalidMcfReferenceField();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            this.mNativeScopeToJavaScope.put(extractNativePointerFromMcfReference, obj);
        }
    }

    private void dispatchNotificationToCallbacks(String str, Long l, Object obj) {
        Set set;
        if (obj == null || (obj instanceof Map)) {
            Map map = (Map) obj;
            ArrayList arrayList = new ArrayList();
            Object obj2 = null;
            synchronized (this) {
                if (l != null) {
                    obj2 = this.mNativeScopeToJavaScope.get(l);
                }
                for (Map.Entry entry : this.mObserverConfigs.entrySet()) {
                    C20900xe r1 = (C20900xe) entry.getValue();
                    if (r1.A01.contains(str) || ((set = (Set) r1.A00.get(obj2)) != null && set.contains(str))) {
                        arrayList.add(entry.getKey());
                    }
                }
            }
            StringBuilder sb = new StringBuilder("NotificationCenterGet notification ");
            sb.append(str);
            sb.append(" with scope ");
            sb.append(obj2);
            sb.append(" and payload ");
            sb.append(obj);
            Log.d(sb.toString());
            if (!arrayList.isEmpty()) {
                C32991g1 r12 = new C32991g1(arrayList, str, obj2, map);
                Execution.assertInitialized();
                try {
                    if (((Integer) Execution.sThreadLocalExecutionContext.get()).intValue() == 1) {
                        r12.run();
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                Execution.executeAsync(r12, 1);
                return;
            }
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ");
        A0S.append(obj.getClass().getName());
        throw new RuntimeException(A0S.toString());
    }

    public static Long extractNativePointerFromMcfReference(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mMcfReference");
            declaredField.setAccessible(true);
            if (declaredField.getType().equals(McfReferenceHolder.class)) {
                return Long.valueOf(((McfReferenceHolder) declaredField.get(obj)).nativeReference);
            }
            throwInvalidMcfReferenceField();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    private boolean notificationNameExistsInSomeObserver(String str) {
        loop0:
        for (Map.Entry entry : this.mObserverConfigs.entrySet()) {
            C20900xe r1 = (C20900xe) entry.getValue();
            if (!r1.A01.contains(str)) {
                Iterator it = new HashSet(r1.A00.entrySet()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Set) ((Map.Entry) it.next()).getValue()).contains(str)) {
                            break loop0;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean observerHasConfig(NotificationCallback notificationCallback, String str, Object obj) {
        C20900xe r0 = (C20900xe) this.mObserverConfigs.get(notificationCallback);
        if (r0 == null) {
            return false;
        }
        if (obj == null) {
            return r0.A01.contains(str);
        }
        Set set = (Set) r0.A00.get(obj);
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public synchronized void removeEveryObserver(NotificationCallback notificationCallback) {
        HashSet hashSet;
        HashMap hashMap;
        if (notificationCallback != null) {
            C20900xe r7 = (C20900xe) this.mObserverConfigs.get(notificationCallback);
            if (r7 != null) {
                C32981g0 r6 = new C32981g0(this, notificationCallback);
                synchronized (r7) {
                    hashSet = new HashSet(r7.A01);
                    hashMap = new HashMap();
                    Iterator it = new HashSet(r7.A00.entrySet()).iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        hashMap.put(entry.getKey(), new HashSet((Collection) entry.getValue()));
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    r6.A01.removeObserver(r6.A00, (String) it2.next(), null);
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    Object key = entry2.getKey();
                    for (String str : (Set) entry2.getValue()) {
                        r6.A01.removeObserver(r6.A00, str, key);
                    }
                }
                this.mObserverConfigs.remove(notificationCallback);
            }
        } else {
            throw null;
        }
    }

    public synchronized void removeObserver(NotificationCallback notificationCallback, String str, Object obj) {
        if (notificationCallback == null) {
            throw null;
        } else if (str == null) {
            throw null;
        } else if (observerHasConfig(notificationCallback, str, obj)) {
            removeObserverConfig(notificationCallback, str, obj);
            if (obj != null && !scopeExistInAnyConfig(obj)) {
                removeScopeFromNativeToJavaMappings(obj);
            }
            if (!notificationNameExistsInSomeObserver(str)) {
                this.mMainConfig.remove(str);
                removeObserverNative(str);
            }
        }
    }

    private boolean removeObserverConfig(NotificationCallback notificationCallback, String str, Object obj) {
        boolean z;
        C20900xe r2 = (C20900xe) this.mObserverConfigs.get(notificationCallback);
        if (r2 == null) {
            return false;
        }
        if (obj == null) {
            z = r2.A01.remove(str);
        } else {
            Set set = (Set) r2.A00.get(obj);
            if (set != null) {
                z = set.remove(str);
                if (set.isEmpty()) {
                    r2.A00.remove(obj);
                }
            } else {
                z = false;
            }
        }
        if (r2.A01.isEmpty() && r2.A00.isEmpty()) {
            this.mObserverConfigs.remove(notificationCallback);
        }
        return z;
    }

    private void removeScopeFromNativeToJavaMappings(Object obj) {
        Long extractNativePointerFromMcfReference = extractNativePointerFromMcfReference(obj);
        if (extractNativePointerFromMcfReference == null) {
            throwInvalidMcfReferenceField();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            this.mNativeScopeToJavaScope.remove(extractNativePointerFromMcfReference);
        }
    }

    private boolean scopeExistInAnyConfig(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map.Entry entry : this.mObserverConfigs.entrySet()) {
            C20900xe r0 = (C20900xe) entry.getValue();
            if (r0 == null) {
                throw null;
            } else if (r0.A00.containsKey(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void throwInvalidMcfReferenceField() {
        throw new RuntimeException("Scope object needs to have an mMcfReference field of type McfReferenceHolder");
    }
}
