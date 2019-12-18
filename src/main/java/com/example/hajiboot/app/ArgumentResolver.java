package com.example.hajiboot.app;

import java.io.InputStream;

public interface ArgumentResolver {
    Argument resolve(InputStream stream)
}
