# boot.core

### [`*app-version*`](../boot/core/src/boot/core.clj#L29)

```
The running version of boot app.
```

<hr>

### [`*boot-opts*`](../boot/core/src/boot/core.clj#L32)

```
Command line options for boot itself.
```

<hr>

### [`*boot-script*`](../boot/core/src/boot/core.clj#L30)

```
The script's name (when run as script).
```

<hr>

### [`*boot-version*`](../boot/core/src/boot/core.clj#L31)

```
The running version of boot core.
```

<hr>

### [`*warnings*`](../boot/core/src/boot/core.clj#L33)

```
Count of warnings during build.
```

<hr>

### [`add-asset`](../boot/core/src/boot/core.clj#L419)

```clojure
(add-asset fileset dir & {:keys [mergers include exclude], :as opts})
```

```
Add the contents of the java.io.File dir to the fileset's assets.
```

<hr>

### [`add-cached-asset`](../boot/core/src/boot/core.clj#L424)

```clojure
(add-cached-asset fileset cache-key cache-fn & {:keys [mergers include exclude], :as opts})
```

```
FIXME: document
```

<hr>

### [`add-cached-resource`](../boot/core/src/boot/core.clj#L454)

```clojure
(add-cached-resource fileset cache-key cache-fn & {:keys [mergers include exclude], :as opts})
```

```
FIXME: document
```

<hr>

### [`add-cached-source`](../boot/core/src/boot/core.clj#L439)

```clojure
(add-cached-source fileset cache-key cache-fn & {:keys [mergers include exclude], :as opts})
```

```
FIXME: document
```

<hr>

### [`add-meta`](../boot/core/src/boot/core.clj#L464)

```clojure
(add-meta fileset meta-map)
```

```
Adds metadata about the files in the filesystem to their corresponding
TmpFile objects in the fileset. The meta-map is expected to be a map with
string paths as keys and maps of metadata as values. These metadata maps
will be merged into the TmpFile objects associated with the paths.
```

<hr>

### [`add-resource`](../boot/core/src/boot/core.clj#L449)

```clojure
(add-resource fileset dir & {:keys [mergers include exclude], :as opts})
```

```
Add the contents of the java.io.File dir to the fileset's resources.
```

<hr>

### [`add-source`](../boot/core/src/boot/core.clj#L434)

```clojure
(add-source fileset dir & {:keys [mergers include exclude], :as opts})
```

```
Add the contents of the java.io.File dir to the fileset's sources.
```

<hr>

### [`boot`](../boot/core/src/boot/core.clj#L793)

```clojure
(boot & argv)
```

```
The REPL equivalent to the command line 'boot'. If all arguments are
strings then they are treated as if they were given on the command line.
Otherwise they are assumed to evaluate to task middleware.
```

<hr>

### [`bootignore`](../boot/core/src/boot/core.clj#L37)

```
Set of regexes source file paths must not match.
```

<hr>

### [`by-ext`](../boot/core/src/boot/core.clj#L1009)

```clojure
(by-ext exts files & [negate?])
```

```
This function takes two arguments: `exts` and `files`, where `exts` is a seq
of file extension strings like `[".clj" ".cljs"]` and `files` is a seq of
file objects. Returns a seq of the files in `files` which have file extensions
listed in `exts`.
```

<hr>

### [`by-name`](../boot/core/src/boot/core.clj#L983)

```clojure
(by-name names files & [negate?])
```

```
This function takes two arguments: `names` and `files`, where `names` is
a seq of file name strings like `["foo.clj" "bar.xml"]` and `files` is
a seq of file objects. Returns a seq of the files in `files` which have file
names listed in `names`.
```

<hr>

### [`by-path`](../boot/core/src/boot/core.clj#L996)

```clojure
(by-path paths files & [negate?])
```

```
This function takes two arguments: `paths` and `files`, where `path` is
a seq of path strings like `["a/b/c/foo.clj" "bar.xml"]` and `files` is
a seq of file objects. Returns a seq of the files in `files` which have file
paths listed in `paths`.
```

<hr>

### [`by-re`](../boot/core/src/boot/core.clj#L1022)

```clojure
(by-re res files & [negate?])
```

```
This function takes two arguments: `res` and `files`, where `res` is a seq
of regex patterns like `[#"clj$" #"cljs$"]` and `files` is a seq of
file objects. Returns a seq of the files in `files` whose paths match one of
the regex patterns in `res`.
```

<hr>

### [`cache-dir!`](../boot/core/src/boot/core.clj#L279)

```clojure
(cache-dir! key & {:keys [global]})
```

```
Returns a directory which is managed by boot but whose contents will not be
deleted after the build is complete. The :global option specifies that the
directory is shared by all projects. The default behavior returns different
directories for the same key when run in different projects.
```

<hr>

### [`cleanup`](../boot/core/src/boot/core.clj#L717)

```clojure
(cleanup & body)
```

```
Evaluate body after tasks have been run. This macro is meant to be called
from inside a task definition, and is provided as a means to shutdown or
clean up persistent resources created by the task (eg. threads, files, etc.)
```

<hr>

### [`commit!`](../boot/core/src/boot/core.clj#L378)

```clojure
(commit! fileset)
```

```
Make the underlying temp directories correspond to the immutable fileset
tree structure.
```

<hr>

### [`configure-repositories!`](../boot/core/src/boot/core.clj#L633)

```clojure
(configure-repositories!) (configure-repositories! f)
```

```
Get or set the repository configuration callback function. The function
will be applied to all repositories added to the boot env, it should return
the repository map with any additional configuration (like credentials, for
example).
```

<hr>

### [`cp`](../boot/core/src/boot/core.clj#L410)

```clojure
(cp fileset src-file dest-tmpfile)
```

```
Given a fileset and a dest-tmpfile from that fileset, overwrites the dest
tmpfile with the contents of the java.io.File src-file.
```

<hr>

### [`deftask`](../boot/core/src/boot/core.clj#L695)

```clojure
(deftask sym & forms)
```

```
Define a boot task.
```

<hr>

### [`disable-task!`](../boot/core/src/boot/core.clj#L895)

```clojure
(disable-task! & tasks)
```

```
Disables the given tasks by replacing them with the identity task.

  Example:

      (disable-task! repl jar)
```

<hr>

### [`empty-dir!`](../boot/core/src/boot/core.clj#L508)

```clojure
(empty-dir! & dirs)
```

```
For each directory in dirs, recursively deletes all files and subdirectories.
The directories in dirs themselves are not deleted.
```

<hr>

### [`file-filter`](../boot/core/src/boot/core.clj#L974)

```clojure
(file-filter mkpred)
```

```
A file filtering function factory. FIXME: more documenting here.
```

<hr>

### [`fileset-added`](../boot/core/src/boot/core.clj#L485)

```clojure
(fileset-added before after & props)
```

```
Returns a new fileset containing only files that were added.
```

<hr>

### [`fileset-changed`](../boot/core/src/boot/core.clj#L495)

```clojure
(fileset-changed before after & props)
```

```
Returns a new fileset containing only files that were changed.
```

<hr>

### [`fileset-diff`](../boot/core/src/boot/core.clj#L477)

```clojure
(fileset-diff before after & props)
```

```
Returns a new fileset containing files that were added or modified. Removed
files are not considered. The optional props arguments can be any of :time,
:hash, or both, specifying whether to consider changes to last modified time
or content md5 hash of the files (the default is both).
```

<hr>

### [`fileset-namespaces`](../boot/core/src/boot/core.clj#L500)

```clojure
(fileset-namespaces fileset)
```

```
Returns a set of symbols: the namespaces defined in this fileset.
```

<hr>

### [`fileset-reduce`](../boot/core/src/boot/core.clj#L869)

```clojure
(fileset-reduce fileset get-files & reducers)
```

```
Given a fileset, a function get-files that selects files from the fileset,
and a number of reducing functions, composes the reductions. The result of
the previous reduction and the result of get-files applied to it are passed
through to the next reducing function.
```

<hr>

### [`fileset-removed`](../boot/core/src/boot/core.clj#L490)

```clojure
(fileset-removed before after & props)
```

```
Returns a new fileset containing only files that were removed.
```

<hr>

### [`get-env`](../boot/core/src/boot/core.clj#L641)

```clojure
(get-env & [k not-found])
```

```
Returns the value associated with the key `k` in the boot environment, or
`not-found` if the environment doesn't contain key `k` and `not-found` was
given. Calling this function with no arguments returns the environment map.
```

<hr>

### [`get-sys-env`](../boot/core/src/boot/core.clj#L673)

```clojure
(get-sys-env) (get-sys-env k) (get-sys-env k not-found)
```

```
Returns the value associated with the system property k, the environment
variable k, or not-found if neither of those are set. If not-found is the
keyword :required, an exception will be thrown when there is no value for
either the system property or environment variable k.
```

<hr>

### [`git-files`](../boot/core/src/boot/core.clj#L968)

```clojure
(git-files & {:keys [untracked]})
```

```
Returns a list of files roughly equivalent to what you'd get with the git
command line `git ls-files`. The :untracked option includes untracked files.
```

<hr>

### [`gpg-decrypt`](../boot/core/src/boot/core.clj#L933)

```clojure
(gpg-decrypt path-or-file & {:keys [as]})
```

```
Uses gpg(1) to decrypt a file and returns its contents as a string. The
:as :edn option can be passed to read the contents as an EDN form.
```

<hr>

### [`init!`](../boot/core/src/boot/core.clj#L555)

```clojure
(init!)
```

```
Initialize the boot environment. This is normally run once by boot at
startup. There should be no need to call this function directly.
```

<hr>

### [`input-dirs`](../boot/core/src/boot/core.clj#L338)

```clojure
(input-dirs fileset)
```

```
Get a list of directories containing files with input roles.
```

<hr>

### [`input-files`](../boot/core/src/boot/core.clj#L353)

```clojure
(input-files fileset)
```

```
Get a set of TmpFile objects corresponding to files with input role.
```

<hr>

### [`input-fileset`](../boot/core/src/boot/core.clj#L358)

```clojure
(input-fileset fileset)
```

```
FIXME: document
```

<hr>

### [`json-generate`](../boot/core/src/boot/core.clj#L939)

```clojure
(json-generate x & [opt-map])
```

```
Same as cheshire.core/generate-string.
```

<hr>

### [`json-parse`](../boot/core/src/boot/core.clj#L945)

```clojure
(json-parse x & [key-fn])
```

```
Same as cheshire.core/parse-string.
```

<hr>

### [`last-file-change`](../boot/core/src/boot/core.clj#L36)

```
Last source file watcher update time.
```

<hr>

### [`launch-nrepl`](../boot/core/src/boot/core.clj#L1037)

```clojure
(launch-nrepl & {:keys [pod], :as opts})
```

```
Launches an nREPL server in a pod. See the repl task for options.
```

<hr>

### [`load-data-readers!`](../boot/core/src/boot/core.clj#L181)

```clojure
(load-data-readers!)
```

```
Refresh *data-readers* with readers from newly acquired dependencies.
```

<hr>

### [`ls`](../boot/core/src/boot/core.clj#L373)

```clojure
(ls fileset)
```

```
Get a set of TmpFile objects for all files in the fileset.
```

<hr>

### [`merge-env!`](../boot/core/src/boot/core.clj#L663)

```clojure
(merge-env! & kvs)
```

```
Merges the new values into the current values for the given keys in the env
map. Uses a merging strategy that is appropriate for the given key (eg. uses
clojure.core/into for keys whose values are collections and simply replaces
Keys whose values aren't collections).
```

<hr>

### [`mv`](../boot/core/src/boot/core.clj#L404)

```clojure
(mv fileset from-path to-path)
```

```
Given a fileset and two paths in the fileset, from-path and to-path, moves
the tmpfile at from-path to to-path, returning a new fileset.
```

<hr>

### [`mv-asset`](../boot/core/src/boot/core.clj#L429)

```clojure
(mv-asset fileset tmpfiles)
```

```
FIXME: document
```

<hr>

### [`mv-resource`](../boot/core/src/boot/core.clj#L459)

```clojure
(mv-resource fileset tmpfiles)
```

```
FIXME: document
```

<hr>

### [`mv-source`](../boot/core/src/boot/core.clj#L444)

```clojure
(mv-source fileset tmpfiles)
```

```
FIXME: document
```

<hr>

### [`new-build-at`](../boot/core/src/boot/core.clj#L35)

```
Latest build occured at time.
```

<hr>

### [`new-fileset`](../boot/core/src/boot/core.clj#L80)

```
FIXME: document this
```

<hr>

### [`not-by-ext`](../boot/core/src/boot/core.clj#L1017)

```clojure
(not-by-ext exts files)
```

```
This function is the same as `by-ext` but negated.
```

<hr>

### [`not-by-name`](../boot/core/src/boot/core.clj#L991)

```clojure
(not-by-name names files)
```

```
This function is the same as `by-name` but negated.
```

<hr>

### [`not-by-path`](../boot/core/src/boot/core.clj#L1004)

```clojure
(not-by-path paths files)
```

```
This function is the same as `by-path` but negated.
```

<hr>

### [`not-by-re`](../boot/core/src/boot/core.clj#L1030)

```clojure
(not-by-re res files)
```

```
This function is the same as `by-re` but negated.
```

<hr>

### [`output-dirs`](../boot/core/src/boot/core.clj#L343)

```clojure
(output-dirs fileset)
```

```
FIXME: document this
```

<hr>

### [`output-files`](../boot/core/src/boot/core.clj#L363)

```clojure
(output-files fileset)
```

```
Get a set of TmpFile objects corresponding to files with output role.
```

<hr>

### [`output-fileset`](../boot/core/src/boot/core.clj#L368)

```clojure
(output-fileset fileset)
```

```
FIXME: document
```

<hr>

### [`post-env!`](../boot/core/src/boot/core.clj#L586)

```
Event handler called when the env atom is modified. This handler is for
performing side-effects associated with maintaining the application state in
the env atom. For example, when `:src-paths` is modified the handler adds
the new directories to the classpath.
```

<hr>

### [`pre-env!`](../boot/core/src/boot/core.clj#L600)

```
This multimethod is used to modify how new values are merged into the boot
atom when `set-env!` is called. This function's result will become the new
value associated with the given `key` in the env atom.
```

<hr>

### [`rebuild!`](../boot/core/src/boot/core.clj#L550)

```clojure
(rebuild!)
```

```
Manually trigger build watch.
```

<hr>

### [`replace-task!`](../boot/core/src/boot/core.clj#L882)

```clojure
(replace-task! & replacements)
```

```
Given a number of binding form and function pairs, this macro alters the
root bindings of task vars, replacing their values with the given functions.

Example:

(replace-task!
  [r repl] (fn [& xs] (apply r :port 12345 xs))
  [j jar]  (fn [& xs] (apply j :manifest {"howdy" "world"} xs)))
```

<hr>

### [`reset-build!`](../boot/core/src/boot/core.clj#L737)

```clojure
(reset-build!)
```

```
Resets mutable build state to default values. This includes such things as
warning counters etc., state that is relevant to a single build cycle. This
function should be called before each build iteration.
```

<hr>

### [`reset-fileset`](../boot/core/src/boot/core.clj#L724)

```clojure
(reset-fileset & [fileset])
```

```
Updates the user directories in the fileset with the latest project files,
returning a new immutable fileset. When called with no args returns a new
fileset containing only the latest project files.
```

<hr>

### [`rm`](../boot/core/src/boot/core.clj#L385)

```clojure
(rm fileset files)
```

```
Removes files from the fileset tree, returning a new fileset object. This
does not affect the underlying filesystem in any way.
```

<hr>

### [`set-env!`](../boot/core/src/boot/core.clj#L648)

```clojure
(set-env! & kvs)
```

```
Update the boot environment atom `this` with the given key-value pairs given
in `kvs`. See also `post-env!` and `pre-env!`. The values in the env map must
be both printable by the Clojure printer and readable by its reader. If the
value for a key is a function, that function will be applied to the current
value of that key and the result will become the new value (similar to how
clojure.core/update-in works.
```

<hr>

### [`set-sys-env!`](../boot/core/src/boot/core.clj#L685)

```clojure
(set-sys-env! & kvs)
```

```
For each key value pair in kvs the system property corresponding to the key
is set. Keys and values must be strings, but the value can be nil or false
to remove the system property.
```

<hr>

### [`sync!`](../boot/core/src/boot/core.clj#L514)

```clojure
(sync! dest & srcs)
```

```
Given a dest directory and one or more srcs directories, overlays srcs on
dest, removing files in dest that are not in srcs. Uses file modification
timestamps to decide which version of files to emit to dest. Uses hardlinks
instead of copying file contents. File modification times are preserved.
```

<hr>

### [`task-options!`](../boot/core/src/boot/core.clj#L905)

```clojure
(task-options! & task-option-pairs)
```

```
Given a number of task/map-of-curried-arguments pairs, replaces the root
bindings of the tasks with their curried values. For example:

    (task-options!
      repl {:port     12345}
      jar  {:manifest {:howdy "world"}})

You can update options, too, by providing a function instead of an option
map. This function will be passed the current option map and its result will
be used as the new one. For example:

    (task-options!
      repl #(update-in % [:port] (fnil inc 1234))
      jar  #(assoc-in % [:manifest "ILike"] "Turtles"))
```

<hr>

### [`temp-dir!`](../boot/core/src/boot/core.clj#L277)

```clojure
(temp-dir! & args__594__auto__)
```

```
#'boot.core/temp-dir! was deprecated, please use #'boot.core/tmp-dir! instead
```

<hr>

### [`tmp-dir`](../boot/core/src/boot/core.clj#L304)

```clojure
(tmp-dir tmpfile)
```

```
Returns the temporary directory containing the tmpfile.
```

<hr>

### [`tmp-dir!`](../boot/core/src/boot/core.clj#L273)

```clojure
(tmp-dir!)
```

```
Creates a boot-managed temporary directory, returning a java.io.File.
```

<hr>

### [`tmp-file`](../boot/core/src/boot/core.clj#L310)

```clojure
(tmp-file tmpfile)
```

```
Returns the java.io.File object for the tmpfile.
```

<hr>

### [`tmp-get`](../boot/core/src/boot/core.clj#L324)

```clojure
(tmp-get fileset path & [not-found])
```

```
Given a fileset and a path, returns the associated TmpFile record. If the
not-found argument is specified and the TmpFile is not in the fileset then
not-found is returned, otherwise nil.
```

<hr>

### [`tmp-path`](../boot/core/src/boot/core.clj#L298)

```clojure
(tmp-path tmpfile)
```

```
Returns the tmpfile's path relative to the fileset root.
```

<hr>

### [`tmp-time`](../boot/core/src/boot/core.clj#L316)

```clojure
(tmp-time tmpfile)
```

```
Returns the last modified timestamp for the tmpfile.
```

<hr>

### [`tmpdir`](../boot/core/src/boot/core.clj#L308)

```clojure
(tmpdir & args__594__auto__)
```

```
#'boot.core/tmpdir was deprecated, please use #'boot.core/tmp-dir instead
```

<hr>

### [`tmpfile`](../boot/core/src/boot/core.clj#L314)

```clojure
(tmpfile & args__594__auto__)
```

```
#'boot.core/tmpfile was deprecated, please use #'boot.core/tmp-file instead
```

<hr>

### [`tmpget`](../boot/core/src/boot/core.clj#L330)

```clojure
(tmpget & args__594__auto__)
```

```
#'boot.core/tmpget was deprecated, please use #'boot.core/tmp-get instead
```

<hr>

### [`tmppath`](../boot/core/src/boot/core.clj#L302)

```clojure
(tmppath & args__594__auto__)
```

```
#'boot.core/tmppath was deprecated, please use #'boot.core/tmp-path instead
```

<hr>

### [`tmptime`](../boot/core/src/boot/core.clj#L320)

```clojure
(tmptime & args__594__auto__)
```

```
#'boot.core/tmptime was deprecated, please use #'boot.core/tmp-time instead
```

<hr>

### [`touch`](../boot/core/src/boot/core.clj#L963)

```clojure
(touch f)
```

```
Same as the Unix touch(1) program.
```

<hr>

### [`user-dirs`](../boot/core/src/boot/core.clj#L332)

```clojure
(user-dirs fileset)
```

```
Get a list of directories containing files that originated in the project's
source, resource, or asset paths.
```

<hr>

### [`user-files`](../boot/core/src/boot/core.clj#L347)

```clojure
(user-files fileset)
```

```
Get a set of TmpFile objects corresponding to files that originated in
the project's source, resource, or asset paths.
```

<hr>

### [`watch-dirs`](../boot/core/src/boot/core.clj#L524)

```clojure
(watch-dirs callback dirs & {:keys [debounce]})
```

```
Watches dirs for changes and calls callback with set of changed files
when file(s) in these directories are modified. Returns a thunk which
will stop the watcher.

The watcher uses the somewhat quirky native filesystem event APIs. A
debounce option is provided (in ms, default 10) which can be used to
tune the watcher sensitivity.
```

<hr>

### [`with-pass-thru`](../boot/core/src/boot/core.clj#L859)

```clojure
(with-pass-thru bind & body)
```

```
Given a binding and body expressions, constructs a task handler. The body
expressions are evaluated for side effects with the current fileset bound
to binding. The current fileset is then passed to the next handler and the
result is then returned up the handler stack.
```

<hr>

### [`with-post-wrap`](../boot/core/src/boot/core.clj#L833)

```clojure
(with-post-wrap bind & body)
```

```
Given a binding and body expressions, constructs a task handler. The next
handler is called with the current fileset, and the result is bound to
binding. The body expressions are then evaluated for side effects and the
bound fileset is returned up the handler stack. Roughly equivalent to:

    (fn [next-handler]
      (fn [fileset]
        (let [binding (next-handler fileset)]
          (do ... ...)
          binding)))

where ... are the given body expressions.
```

<hr>

### [`with-pre-wrap`](../boot/core/src/boot/core.clj#L809)

```clojure
(with-pre-wrap bind & body)
```

```
Given a binding and body expressions, constructs a task handler. The body
expressions are evaluated with the current fileset bound to binding, and the
result is passed to the next handler in the pipeline. The fileset obtained
from the next handler is then returned up the handler stack. The body must
evaluate to a fileset object. Roughly equivalent to:

    (fn [next-handler]
      (fn [binding]
        (next-handler (do ... ...))))

where ... are the given body expressions.
```

<hr>

### [`yaml-generate`](../boot/core/src/boot/core.clj#L951)

```clojure
(yaml-generate x)
```

```
Same as clj-yaml.core/generate-string.
```

<hr>

### [`yaml-parse`](../boot/core/src/boot/core.clj#L957)

```clojure
(yaml-parse x)
```

```
Same as clj-yaml.core/parse-string.
```

<hr>

