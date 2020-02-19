import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;


public class API {
    public static void main(String[] args) throws IOException {
        GitHub github = new GitHubBuilder().withPassword("rcarreraamoedo", "").build();
        GHRepository repo = github.createRepository(
                "Repositorio API", "Repositorio",
                "https://github.com/rcarreraamoedo", true/*public*/);
    }
}
