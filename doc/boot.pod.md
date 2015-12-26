# boot.pod

Namespace containing various utility functions and macros to make
life easier in Boot scripts.

[`add-classpath`](#add-classpath) [`add-dependencies`](#add-dependencies) [`add-dependencies-in`](#add-dependencies-in) [`add-dependencies-worker`](#add-dependencies-worker) [`add-shutdown-hook!`](#add-shutdown-hook) [`apply-exclusions`](#apply-exclusions) [`apply-global-exclusions`](#apply-global-exclusions) [`call-in*`](#call-in) [`caller-namespace`](#caller-namespace) [`canonical-coord`](#canonical-coord) [`classloader-hierarchy`](#classloader-hierarchy) [`classloader-resources`](#classloader-resources) [`concat-merger`](#concat-merger) [`copy-dependency-jar-entries`](#copy-dependency-jar-entries) [`copy-resource`](#copy-resource) [`copy-url`](#copy-url) [`data`](#data) [`default-dependencies`](#default-dependencies) [`dependency-loaded?`](#dependency-loaded?) [`dependency-pom-properties`](#dependency-pom-properties) [`dependency-pom-properties-map`](#dependency-pom-properties-map) [`destroy-pod`](#destroy-pod) [`env`](#env) [`eval-fn-call`](#eval-fn-call) [`eval-in*`](#eval-in) [`extract-ids`](#extract-ids) [`first-wins-merger`](#first-wins-merger) [`get-classpath`](#get-classpath) [`get-pods`](#get-pods) [`into-merger`](#into-merger) [`jar-entries`](#jar-entries) [`jar-entries*`](#jar-entries) [`jar-entries-memoized*`](#jar-entries-memoized) [`jars-dep-graph`](#jars-dep-graph) [`jars-in-dep-order`](#jars-in-dep-order) [`lifecycle-pool`](#lifecycle-pool) [`make-pod`](#make-pod) [`modifiable-classloader?`](#modifiable-classloader?) [`non-caching-url-input-stream`](#non-caching-url-input-stream) [`outdated`](#outdated) [`pod-id`](#pod-id) [`pod-pool`](#pod-pool) [`pods`](#pods) [`pom-properties`](#pom-properties) [`pom-properties-map`](#pom-properties-map) [`pom-xml`](#pom-xml) [`pom-xml-map`](#pom-xml-map) [`require-in`](#require-in) [`resolve-dependencies`](#resolve-dependencies) [`resolve-dependency-jar`](#resolve-dependency-jar) [`resolve-dependency-jars`](#resolve-dependency-jars) [`resolve-nontransitive-dependencies`](#resolve-nontransitive-dependencies) [`resources`](#resources) [`seal-app-classloader`](#seal-app-classloader) [`send!`](#send) [`set-data!`](#set-data) [`set-pod-id!`](#set-pod-id) [`set-pods!`](#set-pods) [`set-worker-pod!`](#set-worker-pod) [`shutdown-hooks`](#shutdown-hooks) [`standard-jar-exclusions`](#standard-jar-exclusions) [`standard-jar-mergers`](#standard-jar-mergers) [`unpack-jar`](#unpack-jar) [`with-call-in`](#with-call-in) [`with-call-worker`](#with-call-worker) [`with-eval-in`](#with-eval-in) [`with-eval-worker`](#with-eval-worker) [`worker-pod`](#worker-pod)

<hr>

### [`add-classpath`](../../2.5.2/boot/pod/src/boot/pod.clj#L50)

```clojure
(add-classpath jar-or-dir) (add-classpath jar-or-dir classloader)
```

```
A corollary to the (deprecated) `add-classpath` in clojure.core. This implementation
requires a java.io.File or String path to a jar file or directory, and will attempt
to add that path to the right classloader (with the search rooted at the current
thread's context classloader).
```

<hr>

### [`add-dependencies`](../../2.5.2/boot/pod/src/boot/pod.clj#L335)

```clojure
(add-dependencies env)
```

```
FIXME: document this
```

<hr>

### [`add-dependencies-in`](../../2.5.2/boot/pod/src/boot/pod.clj#L339)

```clojure
(add-dependencies-in pod env)
```

```
FIXME: document this
```

<hr>

### [`add-dependencies-worker`](../../2.5.2/boot/pod/src/boot/pod.clj#L344)

```clojure
(add-dependencies-worker env)
```

```
FIXME: document this
```

<hr>

### [`add-shutdown-hook!`](../../2.5.2/boot/pod/src/boot/pod.clj#L207)

```clojure
(add-shutdown-hook! f)
```

```
FIXME: document this
```

<hr>

### [`apply-exclusions`](../../2.5.2/boot/pod/src/boot/pod.clj#L320)

```clojure
(apply-exclusions excl [p v & opts :as dep])
```

```
FIXME: document this
```

<hr>

### [`apply-global-exclusions`](../../2.5.2/boot/pod/src/boot/pod.clj#L331)

```clojure
(apply-global-exclusions excl deps)
```

```
FIXME: document this
```

<hr>

### [`call-in*`](../../2.5.2/boot/pod/src/boot/pod.clj#L226)

```clojure
(call-in* expr) (call-in* pod expr)
```

```
FIXME: document this
```

<hr>

### [`caller-namespace`](../../2.5.2/boot/pod/src/boot/pod.clj#L483)

```clojure
(caller-namespace)
```

```
FIXME: document this
```

<hr>

### [`canonical-coord`](../../2.5.2/boot/pod/src/boot/pod.clj#L280)

```clojure
(canonical-coord [id & more :as coord])
```

```
FIXME: document this
```

<hr>

### [`classloader-hierarchy`](../../2.5.2/boot/pod/src/boot/pod.clj#L36)

```clojure
(classloader-hierarchy) (classloader-hierarchy tip)
```

```
Returns a seq of classloaders, with the tip of the hierarchy first.
Uses the current thread context ClassLoader as the tip ClassLoader
if one is not provided.
```

<hr>

### [`classloader-resources`](../../2.5.2/boot/pod/src/boot/pod.clj#L80)

```clojure
(classloader-resources resource-name) (classloader-resources classloaders resource-name)
```

```
Returns a sequence of [classloader url-seq] pairs representing all
of the resources of the specified name on the classpath of each
classloader. If no classloaders are given, uses the
classloader-heirarchy, in which case the order of pairs will be
such that the first url mentioned will in most circumstances match
what clojure.java.io/resource returns.
```

<hr>

### [`concat-merger`](../../2.5.2/boot/pod/src/boot/pod.clj#L383)

```clojure
(concat-merger prev new out)
```

```
FIXME: document this
```

<hr>

### [`copy-dependency-jar-entries`](../../2.5.2/boot/pod/src/boot/pod.clj#L420)

```clojure
(copy-dependency-jar-entries env outdir coord & regexes)
```

```
FIXME: document this
```

<hr>

### [`copy-resource`](../../2.5.2/boot/pod/src/boot/pod.clj#L165)

```clojure
(copy-resource resource-path out-path)
```

```
FIXME: document this
```

<hr>

### [`copy-url`](../../2.5.2/boot/pod/src/boot/pod.clj#L175)

```clojure
(copy-url url-str out-path & {:keys [cache], :or {cache true}})
```

```
FIXME: document this
```

<hr>

### [`data`](../../2.5.2/boot/pod/src/boot/pod.clj#L182)

```
FIXME: document this
```

<hr>

### [`default-dependencies`](../../2.5.2/boot/pod/src/boot/pod.clj#L476)

```clojure
(default-dependencies deps {:keys [dependencies], :as env})
```

```
FIXME: document this
```

<hr>

### [`dependency-loaded?`](../../2.5.2/boot/pod/src/boot/pod.clj#L128)

```clojure
(dependency-loaded? [project & _])
```

```
FIXME: document this
```

<hr>

### [`dependency-pom-properties`](../../2.5.2/boot/pod/src/boot/pod.clj#L133)

```clojure
(dependency-pom-properties coord)
```

```
FIXME: document this
```

<hr>

### [`dependency-pom-properties-map`](../../2.5.2/boot/pod/src/boot/pod.clj#L138)

```clojure
(dependency-pom-properties-map coord)
```

```
FIXME: document this
```

<hr>

### [`destroy-pod`](../../2.5.2/boot/pod/src/boot/pod.clj#L507)

```clojure
(destroy-pod pod)
```

```
FIXME: document this
```

<hr>

### [`env`](../../2.5.2/boot/pod/src/boot/pod.clj#L181)

```
FIXME: document this
```

<hr>

### [`eval-fn-call`](../../2.5.2/boot/pod/src/boot/pod.clj#L219)

```clojure
(eval-fn-call [f & args])
```

```
FIXME: document this
```

<hr>

### [`eval-in*`](../../2.5.2/boot/pod/src/boot/pod.clj#L254)

```clojure
(eval-in* expr) (eval-in* pod expr)
```

```
FIXME: document this
```

<hr>

### [`extract-ids`](../../2.5.2/boot/pod/src/boot/pod.clj#L22)

```clojure
(extract-ids sym)
```

```
FIXME: document this
```

<hr>

### [`first-wins-merger`](../../2.5.2/boot/pod/src/boot/pod.clj#L389)

```clojure
(first-wins-merger prev _ out)
```

```
FIXME: document this
```

<hr>

### [`get-classpath`](../../2.5.2/boot/pod/src/boot/pod.clj#L65)

```clojure
(get-classpath) (get-classpath classloaders)
```

```
Returns the effective classpath (i.e. _not_ the value of
(System/getProperty "java.class.path") as a seq of URL strings.

Produces the classpath from all classloaders by default, or from a
collection of classloaders if provided.  This allows you to easily look
at subsets of the current classloader hierarchy, e.g.:

(get-classpath (drop 2 (classloader-hierarchy)))
```

<hr>

### [`get-pods`](../../2.5.2/boot/pod/src/boot/pod.clj#L193)

```clojure
(get-pods name-or-pattern) (get-pods name-or-pattern unique?)
```

```
FIXME: document this
```

<hr>

### [`into-merger`](../../2.5.2/boot/pod/src/boot/pod.clj#L376)

```clojure
(into-merger prev new out)
```

```
FIXME: document this
```

<hr>

### [`jar-entries`](../../2.5.2/boot/pod/src/boot/pod.clj#L366)

```clojure
(jar-entries path-or-jarfile & {:keys [cache], :or {cache true}})
```

```
Given a path to a jar file, returns a list of [resource-path, resource-url]
string pairs corresponding to all entries contained the jar contains.
```

<hr>

### [`jar-entries*`](../../2.5.2/boot/pod/src/boot/pod.clj#L348)

```clojure
(jar-entries* path-or-jarfile)
```

```
FIXME: document this
```

<hr>

### [`jar-entries-memoized*`](../../2.5.2/boot/pod/src/boot/pod.clj#L364)

```
FIXME: document this
```

<hr>

### [`jars-dep-graph`](../../2.5.2/boot/pod/src/boot/pod.clj#L412)

```clojure
(jars-dep-graph env)
```

```
FIXME: document this
```

<hr>

### [`jars-in-dep-order`](../../2.5.2/boot/pod/src/boot/pod.clj#L416)

```clojure
(jars-in-dep-order env)
```

```
FIXME: document this
```

<hr>

### [`lifecycle-pool`](../../2.5.2/boot/pod/src/boot/pod.clj#L435)

```clojure
(lifecycle-pool size create destroy & {:keys [priority]})
```

```
FIXME: document this
```

<hr>

### [`make-pod`](../../2.5.2/boot/pod/src/boot/pod.clj#L492)

```clojure
(make-pod) (make-pod {:keys [directories dependencies], :as env})
```

```
FIXME: document this
```

<hr>

### [`modifiable-classloader?`](../../2.5.2/boot/pod/src/boot/pod.clj#L43)

```clojure
(modifiable-classloader? cl)
```

```
Returns true iff the given ClassLoader is of a type that satisfies
the dynapath.dynamic-classpath/DynamicClasspath protocol, and it can
be modified.
```

<hr>

### [`non-caching-url-input-stream`](../../2.5.2/boot/pod/src/boot/pod.clj#L171)

```clojure
(non-caching-url-input-stream url-str)
```

```
FIXME: document this
```

<hr>

### [`outdated`](../../2.5.2/boot/pod/src/boot/pod.clj#L307)

```clojure
(outdated env & {:keys [snapshots]})
```

```
FIXME: document this
```

<hr>

### [`pod-id`](../../2.5.2/boot/pod/src/boot/pod.clj#L184)

```
FIXME: document this
```

<hr>

### [`pod-pool`](../../2.5.2/boot/pod/src/boot/pod.clj#L513)

```clojure
(pod-pool env & {:keys [size init destroy]})
```

```
Creates a pod pool service. The service maintains a pool of prebuilt pods
with a current active pod and a number of pods in reserve, warmed and ready
to go (it takes ~2s to load clojure.core into a pod).

Pool Service API:
-----------------

The pod-pool function returns a pod service instance, which is itself a
Clojure function. The pod service function can be called with no arguments
or with :refresh or :shutdown.

Calling the function with no arguments produces a reference to the current
pod. Expressions can be evaluated in this pod via with-eval-in, etc.

Calling the function with the :refresh argument swaps out the current pod,
destroys it, and promotes a pod from the reserve pool. A new pod is created
asynchronously to replenish the reserve pool.

Calling the function with the :shutdown argument destroys all pods in the
pool and shuts down the service.

Options:
--------

:size       The total number of pods to be maintained in the pool. Default
            size is 2.
:init       A function that is called when a new pod is created. Takes the
            new pod as an argument, is evaluated for side effects only.
:destroy    A function that is called when a pod is destroyed. Takes the pod
            to be destroyed as an argument, is evaluated for side effects
            before pod is destroyed.
```

<hr>

### [`pods`](../../2.5.2/boot/pod/src/boot/pod.clj#L183)

```
FIXME: document this
```

<hr>

### [`pom-properties`](../../2.5.2/boot/pod/src/boot/pod.clj#L110)

```clojure
(pom-properties jarpath)
```

```
FIXME: document this
```

<hr>

### [`pom-properties-map`](../../2.5.2/boot/pod/src/boot/pod.clj#L142)

```clojure
(pom-properties-map prop-or-jarpath)
```

```
FIXME: document this
```

<hr>

### [`pom-xml`](../../2.5.2/boot/pod/src/boot/pod.clj#L150)

```clojure
(pom-xml jarpath) (pom-xml jarpath pompath)
```

```
FIXME: document this
```

<hr>

### [`pom-xml-map`](../../2.5.2/boot/pod/src/boot/pod.clj#L246)

```clojure
(pom-xml-map jarpath) (pom-xml-map jarpath pompath)
```

```
FIXME: document this
```

<hr>

### [`require-in`](../../2.5.2/boot/pod/src/boot/pod.clj#L274)

```clojure
(require-in pod ns)
```

```
FIXME: document this
```

<hr>

### [`resolve-dependencies`](../../2.5.2/boot/pod/src/boot/pod.clj#L285)

```clojure
(resolve-dependencies env)
```

```
FIXME: document this
```

<hr>

### [`resolve-dependency-jar`](../../2.5.2/boot/pod/src/boot/pod.clj#L301)

```clojure
(resolve-dependency-jar env coord)
```

```
FIXME: document this
```

<hr>

### [`resolve-dependency-jars`](../../2.5.2/boot/pod/src/boot/pod.clj#L289)

```clojure
(resolve-dependency-jars env & [ignore-clj?])
```

```
FIXME: document this
```

<hr>

### [`resolve-nontransitive-dependencies`](../../2.5.2/boot/pod/src/boot/pod.clj#L297)

```clojure
(resolve-nontransitive-dependencies env dep)
```

```
FIXME: document this
```

<hr>

### [`resources`](../../2.5.2/boot/pod/src/boot/pod.clj#L93)

```clojure
(resources resource-name) (resources classloaders resource-name)
```

```
Returns a sequence of URLs representing all of the resources of the
specified name on the effective classpath. This can be useful for
finding name collisions among items on the classpath. In most
circumstances, the first of the returned sequence will be the same
as what clojure.java.io/resource returns.
```

<hr>

### [`seal-app-classloader`](../../2.5.2/boot/pod/src/boot/pod.clj#L27)

```clojure
(seal-app-classloader)
```

```
see https://github.com/clojure-emacs/cider-nrepl#with-immutant
```

<hr>

### [`send!`](../../2.5.2/boot/pod/src/boot/pod.clj#L213)

```clojure
(send! form)
```

```
This is ALPHA status, it may change, be renamed, or removed.
```

<hr>

### [`set-data!`](../../2.5.2/boot/pod/src/boot/pod.clj#L189)

```clojure
(set-data! x)
```

```
FIXME: document this
```

<hr>

### [`set-pod-id!`](../../2.5.2/boot/pod/src/boot/pod.clj#L190)

```clojure
(set-pod-id! x)
```

```
FIXME: document this
```

<hr>

### [`set-pods!`](../../2.5.2/boot/pod/src/boot/pod.clj#L188)

```clojure
(set-pods! x)
```

```
FIXME: document this
```

<hr>

### [`set-worker-pod!`](../../2.5.2/boot/pod/src/boot/pod.clj#L191)

```clojure
(set-worker-pod! x)
```

```
FIXME: document this
```

<hr>

### [`shutdown-hooks`](../../2.5.2/boot/pod/src/boot/pod.clj#L186)

```
FIXME: document this
```

<hr>

### [`standard-jar-exclusions`](../../2.5.2/boot/pod/src/boot/pod.clj#L372)

```
FIXME: document this
```

<hr>

### [`standard-jar-mergers`](../../2.5.2/boot/pod/src/boot/pod.clj#L392)

```
FIXME: document this
```

<hr>

### [`unpack-jar`](../../2.5.2/boot/pod/src/boot/pod.clj#L397)

```clojure
(unpack-jar jar-path dest-dir & opts)
```

```
FIXME: document this
```

<hr>

### [`with-call-in`](../../2.5.2/boot/pod/src/boot/pod.clj#L236)

```clojure
(with-call-in pod expr)
```

```
FIXME: document this
```

<hr>

### [`with-call-worker`](../../2.5.2/boot/pod/src/boot/pod.clj#L242)

```clojure
(with-call-worker expr)
```

```
FIXME: document this
```

<hr>

### [`with-eval-in`](../../2.5.2/boot/pod/src/boot/pod.clj#L264)

```clojure
(with-eval-in pod & body)
```

```
FIXME: document this
```

<hr>

### [`with-eval-worker`](../../2.5.2/boot/pod/src/boot/pod.clj#L270)

```clojure
(with-eval-worker & body)
```

```
FIXME: document this
```

<hr>

### [`worker-pod`](../../2.5.2/boot/pod/src/boot/pod.clj#L185)

```
FIXME: document this
```

<hr>

