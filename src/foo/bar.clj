(ns
  ^{:doc "This is the foo.bar doc."
    :doc/base-path "boot/core/src"
    :doc/toc
    {:fns
     {:title "Basic Functions"
      :intro "Various functions to do various things."}}}
  foo.bar)

(defn ^{:doc/section :fns} baz
  "This is a thing."
  [x & xs]
  (apply + x xs))

(defn ^{:doc/section :fns} baf
  "This is another thing."
  [x & xs]
  (apply + x xs))

(defn ^{:doc/section :fns} quux
  "Omg here we are again."
  ([] 1)
  ([x] 2)
  ([x y] 3))
