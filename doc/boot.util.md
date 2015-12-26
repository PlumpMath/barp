# boot.util

Namespace containing various utility functions and macros to make
life easier in Boot scripts.

[`*colorize?*`](#colorize?) [`*sh-dir*`](#sh-dir) [`*verbosity*`](#verbosity) [`auto-flush`](#auto-flush) [`bind-syms`](#bind-syms) [`colorize?-system-default`](#colorize?-system-default) [`dbug`](#dbug) [`dep-as-map`](#dep-as-map) [`do-while-let`](#do-while-let) [`dosh`](#dosh) [`dotoseq`](#dotoseq) [`exit-error`](#exit-error) [`exit-ok`](#exit-ok) [`extract-ids`](#extract-ids) [`fail`](#fail) [`guard`](#guard) [`index-of`](#index-of) [`info`](#info) [`jarname`](#jarname) [`let-assert-keys`](#let-assert-keys) [`path->ns`](#path->ns) [`pp*`](#pp) [`pp-str`](#pp-str) [`print-ex`](#print-ex) [`print-tree`](#print-tree) [`read-string-all`](#read-string-all) [`sh`](#sh) [`warn`](#warn) [`warn-deprecated`](#warn-deprecated) [`while-let`](#while-let) [`with-err-str`](#with-err-str) [`with-let`](#with-let) [`with-resolve`](#with-resolve) [`with-rethrow`](#with-rethrow) [`with-semaphore`](#with-semaphore) [`with-semaphore-noblock`](#with-semaphore-noblock) [`without-exiting`](#without-exiting)

<hr>

### [`*colorize?*`](../../2.5.2/boot/pod/src/boot/util.clj#L32)

_dynamic_

```clojure

```

```
FIXME: document this
```

<hr>

### [`*sh-dir*`](../../2.5.2/boot/pod/src/boot/util.clj#L212)

_dynamic_

```clojure

```

```
FIXME: document this
```

<hr>

### [`*verbosity*`](../../2.5.2/boot/pod/src/boot/util.clj#L31)

_dynamic_

```clojure

```

```
FIXME: document this
```

<hr>

### [`auto-flush`](../../2.5.2/boot/pod/src/boot/util.clj#L171)

_function_

```clojure
(auto-flush writer)
```

```
FIXME: document this
```

<hr>

### [`bind-syms`](../../2.5.2/boot/pod/src/boot/util.clj#L203)

_function_

```clojure
(bind-syms form)
```

```
FIXME: document this
```

<hr>

### [`colorize?-system-default`](../../2.5.2/boot/pod/src/boot/util.clj#L21)

_function_

```clojure
(colorize?-system-default)
```

```
return whether we should colorize output on this system. This is
true, unless we're on Windows, where this is false. The default
console on Windows does not interprete ansi escape codes. The
default can be overriden by setting the environment variable
BOOT_COLOR=1 or BOOT_COLOR=yes to turn it on or any other value to
turn it off.
```

<hr>

### [`dbug`](../../2.5.2/boot/pod/src/boot/util.clj#L41)

_function_

```clojure
(dbug & more)
```

```
FIXME: document this
```

<hr>

### [`dep-as-map`](../../2.5.2/boot/pod/src/boot/util.clj#L189)

_function_

```clojure
(dep-as-map [project version & kvs])
```

```
FIXME: document this
```

<hr>

### [`do-while-let`](../../2.5.2/boot/pod/src/boot/util.clj#L82)

_macro_

```clojure
(do-while-let [binding test] & body)
```

```
Like while-let, except that the body is executed at least once.
```

<hr>

### [`dosh`](../../2.5.2/boot/pod/src/boot/util.clj#L222)

_function_

```clojure
(dosh & args)
```

```
FIXME: document this
```

<hr>

### [`dotoseq`](../../2.5.2/boot/pod/src/boot/util.clj#L89)

_macro_

```clojure
(dotoseq obj seq-exprs & body)
```

```
FIXME: document this
```

<hr>

### [`exit-error`](../../2.5.2/boot/pod/src/boot/util.clj#L118)

_macro_

```clojure
(exit-error & body)
```

```
FIXME: document this
```

<hr>

### [`exit-ok`](../../2.5.2/boot/pod/src/boot/util.clj#L124)

_macro_

```clojure
(exit-ok & body)
```

```
FIXME: document this
```

<hr>

### [`extract-ids`](../../2.5.2/boot/pod/src/boot/util.clj#L184)

_function_

```clojure
(extract-ids sym)
```

```
FIXME: document this
```

<hr>

### [`fail`](../../2.5.2/boot/pod/src/boot/util.clj#L44)

_function_

```clojure
(fail & more)
```

```
FIXME: document this
```

<hr>

### [`guard`](../../2.5.2/boot/pod/src/boot/util.clj#L108)

_macro_

```clojure
(guard expr & [default])
```

```
Returns nil instead of throwing exceptions.
```

<hr>

### [`index-of`](../../2.5.2/boot/pod/src/boot/util.clj#L199)

_function_

```clojure
(index-of v val)
```

```
FIXME: document this
```

<hr>

### [`info`](../../2.5.2/boot/pod/src/boot/util.clj#L42)

_function_

```clojure
(info & more)
```

```
FIXME: document this
```

<hr>

### [`jarname`](../../2.5.2/boot/pod/src/boot/util.clj#L195)

_function_

```clojure
(jarname project version)
```

```
FIXME: document this
```

<hr>

### [`let-assert-keys`](../../2.5.2/boot/pod/src/boot/util.clj#L98)

_macro_

```clojure
(let-assert-keys binding & body)
```

```
Let expression that throws an exception when any of the expected bindings
is missing.
```

<hr>

### [`path->ns`](../../2.5.2/boot/pod/src/boot/util.clj#L166)

_function_

```clojure
(path->ns path)
```

```
FIXME: document this
```

<hr>

### [`pp*`](../../2.5.2/boot/pod/src/boot/util.clj#L208)

_function_

```clojure
(pp* expr)
```

```
FIXME: document this
```

<hr>

### [`pp-str`](../../2.5.2/boot/pod/src/boot/util.clj#L209)

_function_

```clojure
(pp-str expr)
```

```
FIXME: document this
```

<hr>

### [`print-ex`](../../2.5.2/boot/pod/src/boot/util.clj#L145)

_function_

```clojure
(print-ex ex)
```

```
FIXME: document this
```

<hr>

### [`print-tree`](../../2.5.2/boot/pod/src/boot/util.clj#L154)

_function_

```clojure
(print-tree tree & [prefixes])
```

```
FIXME: document this
```

<hr>

### [`read-string-all`](../../2.5.2/boot/pod/src/boot/util.clj#L210)

_function_

```clojure
(read-string-all s)
```

```
FIXME: document this
```

<hr>

### [`sh`](../../2.5.2/boot/pod/src/boot/util.clj#L214)

_function_

```clojure
(sh & args)
```

```
FIXME: document this
```

<hr>

### [`warn`](../../2.5.2/boot/pod/src/boot/util.clj#L43)

_function_

```clojure
(warn & more)
```

```
FIXME: document this
```

<hr>

### [`warn-deprecated`](../../2.5.2/boot/pod/src/boot/util.clj#L46)

_function_

```clojure
(warn-deprecated & args)
```

```
FIXME: document this
```

<hr>

### [`while-let`](../../2.5.2/boot/pod/src/boot/util.clj#L75)

_macro_

```clojure
(while-let [binding test] & body)
```

```
Repeatedly executes body while test expression is true. Test
expression is bound to binding.
```

<hr>

### [`with-err-str`](../../2.5.2/boot/pod/src/boot/util.clj#L134)

_macro_

```clojure
(with-err-str & body)
```

```
Evaluates exprs in a context in which *err* is bound to a fresh
StringWriter.  Returns the string created by any nested printing
calls.
http://stackoverflow.com/questions/17314128/get-stacktrace-as-string
```

<hr>

### [`with-let`](../../2.5.2/boot/pod/src/boot/util.clj#L69)

_macro_

```clojure
(with-let [binding resource] & body)
```

```
Binds resource to binding and evaluates body.  Then, returns
resource.  It's a cross between doto and with-open.
```

<hr>

### [`with-resolve`](../../2.5.2/boot/pod/src/boot/util.clj#L93)

_macro_

```clojure
(with-resolve bindings & body)
```

```
FIXME: document this
```

<hr>

### [`with-rethrow`](../../2.5.2/boot/pod/src/boot/util.clj#L113)

_macro_

```clojure
(with-rethrow expr message)
```

```
Evaluates expr and rethrows any thrown exceptions with the given message.
```

<hr>

### [`with-semaphore`](../../2.5.2/boot/pod/src/boot/util.clj#L51)

_macro_

```clojure
(with-semaphore sem & body)
```

```
FIXME: document this
```

<hr>

### [`with-semaphore-noblock`](../../2.5.2/boot/pod/src/boot/util.clj#L60)

_macro_

```clojure
(with-semaphore-noblock sem & body)
```

```
FIXME: document this
```

<hr>

### [`without-exiting`](../../2.5.2/boot/pod/src/boot/util.clj#L230)

_macro_

```clojure
(without-exiting & body)
```

```
Evaluates body in a context where System/exit doesn't work.
Returns result of evaluating body, or nil if code in body attempted to exit.
```

<hr>

