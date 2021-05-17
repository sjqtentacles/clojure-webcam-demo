(defproject mygameidea "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"], 
    [com.github.sarxos/webcam-capture "0.3.12"]
    [org.clojure/math.combinatorics "0.1.6"]
    [quil "3.1.0"]
    [org.slf4j/slf4j-simple "1.6.1"]]
  :main ^:skip-aot mygameidea.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
