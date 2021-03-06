(defproject org.immutant/overlay "1.2.2"
  :description "Overlays features from one JBoss AS7 installation onto another"
  :url "http://github.com/immutant/overlay"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/data.json "0.1.1"]
                 [digest "1.4.0"]
                 [progress "1.0.1"]]
  :dev-dependencies [[lein-clojars "0.7.0"]]
  :aliases {"overlay" ["run" "-m" "overlay.main"]})
