(set-env!
  :resource-paths #{"src"}
  :dependencies   '[[org.clojure/clojure "1.7.0"  :scope "provided"]
                    [adzerk/bootlaces    "0.1.10" :scope "test"]])

(require
  '[clojure.java.io :as io]
  '[adzerk.bootlaces :refer :all])

(def +version+ "0.2.5")

(bootlaces! +version+)

(task-options!
  pom  {:project     'barp
        :version     +version+
        :description "Testing"
        :url         "http://example.com"
        :scm         {:url "http://example.com"}
        :license     {"Eclipse Public License" "http://www.eclipse.org/legal/epl-v10.html"}})
