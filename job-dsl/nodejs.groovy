job('NodeJS example') {
    scm {
        git('https://github.com/rikriki/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('rikriki')
            node / gitConfigEmail('frederick.rosales@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
