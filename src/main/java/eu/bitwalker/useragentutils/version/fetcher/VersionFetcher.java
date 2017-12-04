package eu.bitwalker.useragentutils.version.fetcher;

import eu.bitwalker.useragentutils.version.Version;

/**
 * Interaface that gets string and returns extrancted version
 *
 * @author alexr
 */
public interface VersionFetcher {
    Version version(String str);
}
