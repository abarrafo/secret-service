package de.swiesend.secretservice.handlers;

import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.messages.MethodCall;

public class MyMethodCall extends MethodCall {

    public MyMethodCall(String service, String path, String iface, String method, String signature, Object... args)
            throws DBusException {
        super((byte) 0, null, service, path, iface, method, (byte) 0, signature, args);
    }

    // You could also add more convenience constructors if needed
}