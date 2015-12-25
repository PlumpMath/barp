(ns
  ^{:doc "This is the foo.bar doc."
    :doc/sections
    {:fns
     {:name "Basic Functions"
      :desc "Various functions to do various things."}}}
  foo.bar)

(defn ^{:doc/section :fns} baz
  "This is a thing."
  [x & xs]
  (apply + x xs))

(defn ^{:doc/section :fns} baf
  "This is another thing."
  [x & xs]
  (apply + x xs))
